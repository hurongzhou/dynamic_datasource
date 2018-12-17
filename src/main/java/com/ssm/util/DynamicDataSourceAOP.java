package com.ssm.util;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;

/**
 * @author hurong3
 * @date 2018/12/7 上午8:44
 */
public class DynamicDataSourceAOP implements Ordered {
    private Logger logger=LoggerFactory.getLogger(DynamicDataSourceAOP.class);

    private static final String MASTER="master";
    private static final String SLAVE="slave";

    /**
     * before 数据源切换
     *
     * @param pjp
     * @throws Throwable
     */
    public void dynamicDataSource(JoinPoint pjp) throws Throwable {
        String methodName=pjp.getSignature().getName();
        String dbType=getDBTypeKey(methodName);
        DBContextHolder.setDbType(dbType);
        logger.info(methodName+" use dataSource:"+dbType);
    }

    private String getDBTypeKey(String methodName) {
        if (methodName.startsWith("query")||methodName.startsWith("get")||methodName.startsWith("find")){
            return SLAVE;
        }
        return MASTER;
    }

    //设置AOP执行顺序, 这里设置优于事务
    @Override
    public int getOrder() {
        return 1;
    }
}
