package dynamic_proxy;

/**
 * @author MOYU
 * @File JavaSE_Study-dynamic_proxy
 * @Date 2022/7/3 9:34
 **/
public class UserServiceImpl implements UserService {
    @Override
    public String login(String loginName, String passWord) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if ("竹玄羽".equals(loginName) && "123456".equals(passWord)) {
            return "success";
        }
        return "登录名或密码有错误。";
    }

    @Override
    public void selectUsers() {
        try {
            System.out.println("查询了100个用户数据");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public boolean deleteUsers() {

        try {
            System.out.println("删除了100个用户数据");
            Thread.sleep(500);
            return true;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        }
    }
}
