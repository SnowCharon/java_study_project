package com.atguigu.myssm.utils;

/**
 * @title: MyTypeUtil
 * @Author 竹玄羽
 * @Date: 2022/9/7 22:02
 */
public class MyTypeUtil {
    public static boolean isNotMyType(String typeName) {
        return "java.lang.Integer".equals(typeName)
                || "java.lang.String".equals(typeName)
                || "java.lang.Double".equals(typeName)
                || "java.util.Date".equals(typeName)
                || "java.sql.Date".equals(typeName);
    }

    public static boolean isMyType(String typeName) {
        return !isNotMyType(typeName);
    }
}
