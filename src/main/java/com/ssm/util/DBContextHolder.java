package com.ssm.util;

/**
 * @author hurong3
 * @date 2018/12/7 上午8:40
 */
public class DBContextHolder {
    /**
     * 线程threadlocal
     */
    private static ThreadLocal<String> contextHolder = new ThreadLocal<>();

    private static String DEFAUL_DB_TYPE = "master";

    /**
     * 获取本线程的dbtype
     * @return
     */
    public static String getDbType() {
        String db = contextHolder.get();
        if (db == null) {
            // 默认是读写库
            db = DEFAUL_DB_TYPE;
        }
        return db;
    }

    /**
     *
     * 设置本线程的dbtype
     *
     * @param str
     */
    public static void setDbType(String str) {
        contextHolder.set(str);
    }

    /**
     * clearDBType
     *
     * @Title: clearDBType
     * @Description: 清理连接类型
     */
    public static void clearDBType() {
        contextHolder.remove();
    }

}
