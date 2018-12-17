package com.ssm.util;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author hurong3
 * @date 2018/12/7 上午8:37
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DBContextHolder.getDbType();
    }
}
