package zhuxuanyu.reggie.common;

/**
 * @title: BaseContext
 * @Author 竹玄羽
 * @Date: 2023/2/17 13:42
 * 基于ThreadLocal封装工具类，保存和获取登录的用户id
 */
public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    /**
     * 设置当前用户的Id
     * @param id currentId
     */
    public static void setCurrentId(Long id){
        threadLocal.set(id);
    }

    /**
     * 获取登录用户Id
     * @return 返回存储的currentId
     */
    public static Long getCurrentId(){
     return threadLocal.get();
    }
}
