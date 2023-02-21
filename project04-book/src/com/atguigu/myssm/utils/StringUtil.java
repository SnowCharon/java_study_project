package com.atguigu.myssm.utils;

/**
 * @title: StringUtil
 * @Author 竹玄羽
 * @Date: 2022/9/7 22:39
 */
public class StringUtil {
    //判断字符串是否为null或者""
    public static boolean isEmpty(String str) {
        return str == null || "".equals(str);
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }
}
