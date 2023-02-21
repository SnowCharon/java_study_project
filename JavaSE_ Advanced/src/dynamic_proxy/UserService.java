package dynamic_proxy;

/**
 * @author MOYU
 * @File JavaSE_Study-dynamic_proxy
 * @Date 2022/7/3 9:32
 * 模拟用户业务功能
 **/
public interface UserService {
    String login(String loginName,String passWord);
    void selectUsers();
    boolean deleteUsers();
}
