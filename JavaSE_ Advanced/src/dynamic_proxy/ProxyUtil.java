package dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author MOYU
 * @File JavaSE_Study-dynamic_proxy
 * @Date 2022/7/3 10:03
 **/
public class ProxyUtil {
    /**
     * newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
     * 参数一：类加载器，负责加载代理对象到内存中使用
     * 参数二：获取被代理对象实现的全部接口，代理要为全部接口的全部方法进行代理
     * 参数三：代理的核心处理逻辑
     *
     * 生成业务对象的代理对象
     * @param userService 业务对象
     * @return 返回
     */
    public static UserService getProxy(UserServiceImpl userService) {
        return (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(), userService.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //参数一：被代理对象本身
                        //参数二：正在被代理的方法
                        //参数三：被代理方法，应该传入的参数
                        long startTimer = System.currentTimeMillis();
                        //触发方法真正的执行
                        System.out.println("=========代理实现========");
                        Object result = method.invoke(userService, args);
                        long endTimer = System.currentTimeMillis();
                        System.out.println(method.getName() + "方法执行用时：" + (endTimer - startTimer) / 1000.0 + "s");
                        //把业务功能方法执行的将结果返回给调用者
                        return result;
                    }
                });
    }
}
