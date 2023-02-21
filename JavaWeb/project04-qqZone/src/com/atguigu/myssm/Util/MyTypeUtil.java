package com.atguigu.myssm.Util;

/**
 * @title: MyType
 * @Author 竹玄羽
 * @Date: 2022/9/3 12:53
 */
public class MyTypeUtil {
    public static boolean isMyType(String typeName) {
        return !isNotMyType(typeName);
    }

    public static boolean isNotMyType(String typeName) {
        return "java.lang.Integer".equals(typeName) || "java.lang.String".equals(typeName) || "java.util.Date".equals(typeName) || "java.sql.Date".equals(typeName);
    }
}
