package dynamic_proxy;

/**
 * @author MOYU
 * @File JavaSE_Study-dynamic_proxy
 * @Date 2022/7/3 9:52
 **/
public class Demo {
    public static void main(String[] args){
        //1.把业务对象直接做成一个代理对象返回，代理对象的类型是UserService类型
        UserService userService = ProxyUtil.getProxy(new UserServiceImpl());
        System.out.println(userService.login("竹玄羽", "123456"));
        System.out.println(userService.deleteUsers());
        userService.selectUsers();
    }
}
