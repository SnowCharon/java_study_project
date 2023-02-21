package ATMProject;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author 竹玄羽
 * @File ATMProject
 * @date 2022/5/21  15:04
 **/
public class ATMSystem {
    public static void main(String[] args) {
        //1.定义账户类
        //2.定义集合容器，负责以后存储用户对象
        ArrayList<Account> accounts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        //3.展示系统首页
        while (true) {
            System.out.println("======================ATM系统===================");
            System.out.println("1、账户登录");
            System.out.println("2、开户");

            System.out.print("请选择你的操作：");
            int command = sc.nextInt();

            switch (command) {
                case 1:
                    //用户登录
                    login(accounts, sc);
                    break;
                case 2:
                    //开户
                    register(accounts, sc);
                    break;
                default:
                    System.out.println("您输入的命令有误！");
            }
        }
    }

    private static void login(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("======================系统登录操作===================");
        //1.判断账户集合是否有账户
        if (accounts.size() == 0) {
            System.out.println("对不起，当前系统暂无任何账户，请先开户，再来登陆~");
            return;
        }
        //2.输入卡号
        while (true) {
            System.out.print("请您输入您的卡号：");
            String cardId = sc.next();
            Account account = getAccoutByCardId(accounts, cardId);
            if (account == null) {
                System.out.println("该账户不存在！");
            } else {
                while (true) {
                    System.out.print("请您输入密码：");
                    String passWord = sc.next();
                    //判断密码是否正确
                    if (passWord.equals(account.getPassWord())) {
                        System.out.println("尊敬的" + account.getUserName() + ((account.getSex() == '男') ? "先生" : "女士") + "，您的卡号" + account.getCardId() + "已经登陆成功");
                        //展示操作页面
                        showUserCommand(account, sc, accounts);
                        return;  //退回初始界面
                    } else {
                        System.out.println("对不起，密码有误！");
                    }
                }
            }
        }
    }

    //展示操作界面
    private static void showUserCommand(Account account, Scanner sc, ArrayList<Account> accounts) {
        while (true) {
            System.out.println("======================用户操作界面===================");
            System.out.println("1、查询账户");
            System.out.println("2、存款");
            System.out.println("3、取款");
            System.out.println("4、转账");
            System.out.println("5、修改账户信息");
            System.out.println("6、退出");
            System.out.println("7、注销账户");
            System.out.print("请您选择要执行的操作：");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    //查询账户
                    showAccount(account);
                    break;
                case 2:
                    //存款
                    depositMoney(account, sc);
                    break;
                case 3:
                    //取款
                    drawMoney(account, sc);
                    break;
                case 4:
                    //转账
                    transferMoney(accounts, account, sc);
                    break;
                case 5:
                    //修改账户信息
                    updateAccount(account, sc);
                    break;
                case 6:
                    //退出
                    System.out.println("退出成功，欢迎下次光临！");
                    return;
                case 7:
                    //注销账户
                    deleteAccount(accounts, account, sc);
                    return;
                default:
                    System.out.println("输入错误：");
            }
        }
    }

    //销户功能
    private static void deleteAccount(ArrayList<Account> accounts, Account account, Scanner sc) {
        System.out.println("请慎重考虑是否销户！yes/no");
        String rs = sc.next();
        if (rs.equals("yes")) {
            if (account.getMoney() > 0) {
                System.out.println("您当前账户还有余额，不予销户！");
            } else {
                accounts.remove(account);
                System.out.println("您的账户已经注销！");
            }
        } else {
            System.out.println("未销户！");
        }
    }

    //修改账户信息
    private static void updateAccount(Account account, Scanner sc) {
        System.out.print("请输入账户密码确认身份：");
        String passWord = sc.next();
        if (passWord.equals(account.getPassWord())) {
            System.out.println("认证成功！");
        } else {
            System.out.println("认证失败！");
            return;
        }
        while (true) {
            showAccount(account);
            System.out.println("======================修改信息界面===================");
            System.out.println("1、修改用户名");
            System.out.println("2、修改密码");
            System.out.println("3、修改手机号");
            System.out.println("4、修改性别");
            System.out.println("5、修改年龄");
            System.out.println("6、退出修改");
            System.out.print("请选择要执行的操作：");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    //修改用户名
                    while (true) {
                        System.out.print("请输入新的用户名：");
                        String newName = sc.next();
                        if (newName.equals(account.getUserName())) {
                            System.out.println("新旧相同，未做修改！");
                            break;
                        } else {
                            account.setUserName(newName);
                            System.out.println("恭喜您修改成功，" + account.getUserName() + ((account.getSex() == '男') ? "先生！" : "女士！"));
                            break;
                        }
                    }
                    break;
                case 2:
                    //修改密码
                    while (true) {
                        System.out.print("请输入新的密码：");
                        passWord = sc.next();
                        if (passWord.equals(account.getPassWord())) {
                            System.out.println("新旧相同，未做修改！");
                            break;
                        } else {
                            account.setPassWord(passWord);
                            System.out.println("恭喜您修改成功，" + account.getUserName() + ((account.getSex() == '男') ? "先生！" : "女士！"));
                            break;
                        }
                    }
                    break;
                case 3:
                    //修改手机号
                    while (true) {
                        System.out.print("请输入新的手机号：");
                        String telephone = sc.next();
                        if (telephone.equals(account.getTelephone())) {
                            System.out.println("新旧相同，未做修改！");
                            break;
                        } else {
                            account.setTelephone(telephone);
                            System.out.println("恭喜您修改成功，" + account.getUserName() + ((account.getSex() == '男') ? "先生！" : "女士！"));
                            break;
                        }
                    }
                    break;
                case 4:
                    //修改性别
                    while (true) {
                        System.out.print("请修改您的性别：");
                        String s = sc.next();
                        char sex = s.charAt(0);
                        if (sex == account.getSex()) {
                            System.out.println("新旧相同，未做修改！");
                            break;
                        } else {
                            account.setSex(sex);
                            System.out.println("恭喜您修改成功，" + account.getUserName() + ((account.getSex() == '男') ? "先生！" : "女士！"));
                            break;
                        }
                    }
                    break;
                case 5:
                    //修改年龄
                    while (true) {
                        System.out.print("请输入新的年龄：");
                        int age = sc.nextInt();
                        if (age == account.getAge()) {
                            System.out.println("新旧相同，未做修改！");
                            break;
                        } else {
                            account.setAge(age);
                            System.out.println("恭喜您修改成功，" + account.getUserName() + ((account.getSex() == '男') ? "先生！" : "女士！"));
                            break;
                        }
                    }
                    break;
                case 6:
                    return;
                default:
                    System.out.println("输入错误：");
                    System.out.print("请输入要执行的操作：");
            }
        }
    }

    //转账功能
    private static void transferMoney(ArrayList<Account> accounts, Account account, Scanner sc) {
        System.out.println("======================转账界面===================");
        //1.判断用户集合是否有两个账户
        if (accounts.size() < 2) {
            System.out.println("当前系统账户不足两人，无法进行转账！");
            return;
        }

        //2.开始转账
        if (account.getMoney() == 0) {
            System.out.println("对不起，你也是个穷光蛋！");
            return;
        }

        while (true) {
            //3.真正转账
            System.out.print("请输入转账方账户：");
            String cardId = sc.next();
            //这个账号不能是自己
            if (cardId.equals(account.getCardId())) {
                System.out.println("您输入的是自己的账号，无法转账！");
                continue;
            }

            //根据账号找人
            Account acc = getAccoutByCardId(accounts, cardId);
            if (acc == null) {
                System.out.println("对不起，查无此人！");
            } else {
                //账户存在，认证姓氏
                String userName = acc.getUserName();
                String tip = '*' + userName.substring(1);
                System.out.print("请您输入[" + tip + "]的姓氏：");
                String preName = sc.next();
                //判断姓氏是否正确
                if (userName.startsWith(preName)) {
                    while (true) {
                        //认证通过
                        System.out.print("请您输入转账金额：");
                        double money = sc.nextDouble();
                        //判断余额是否充足
                        if (money > account.getMoney()) {
                            System.out.println("对不起，您余额不足" + money + "，您最多可以转账" + account.getMoney());
                        } else {
                            //余额足够
                            account.setMoney(account.getMoney() - money);
                            acc.setMoney(acc.getMoney() + money);
                            System.out.println("转账成功！您的账户余额" + account.getMoney());
                            return;
                        }
                    }
                } else {
                    System.out.println("输入有误！");
                }


            }
        }
    }

    //取钱功能
    private static void drawMoney(Account account, Scanner sc) {
        System.out.println("======================取款界面===================");
        double money;
        while (true) {
            System.out.print("请您输入取款金额：");
            money = sc.nextDouble();

            if (money > account.getQuotaMoney()) {
                //判断是否超过限额
                System.out.println("您当前取款金额超过每次限额，每次最多可取" + account.getQuotaMoney());
            } else {
                //没超过限额，判断是否超过余额
                if (money > account.getMoney()) {
                    System.out.println("余额不足，您当前余额为：" + account.getMoney());
                } else {
                    //可以取款
                    System.out.println("成功取款" + money + "元");
                    //更新余额
                    account.setMoney(account.getMoney() - money);
                    //取款结束
                    showAccount(account);
                    return;  //退出取钱
                }
            }
        }

        //更新余额

    }

    //存钱功能
    private static void depositMoney(Account account, Scanner sc) {
        System.out.println("======================存钱界面===================");
        System.out.print("请您输入存款金额：");
        double money = sc.nextDouble();

        //更新余额
        account.setMoney(account.getMoney() + money);
        System.out.println("存款成功，当前账户信息如下：");
        showAccount(account);
    }

    //展示账户信息
    private static void showAccount(Account account) {
        System.out.println("======================账户信息如下===================");
        System.out.println("卡号：" + account.getCardId());
        System.out.println("户主：" + account.getUserName());
        System.out.println("手机号：" + account.getTelephone());
        System.out.println("性别：" + account.getSex());
        System.out.println("年龄：" + account.getAge());
        System.out.println("余额：" + account.getMoney());
    }

    //用户开户功能实现
    //accounts 接收账户的集合
    public static void register(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("======================系统开户操作===================");
        //1.创建一个账户对象，用于后期封装账户信息
        Account account = new Account();
        //2.录入账户信息
        System.out.print("请您输入用户名：");
        String userName = sc.next();
        account.setUserName(userName);

        System.out.print("请您输入性别：");
        String s = sc.next();
        char sex = s.charAt(0);
        account.setSex(sex);

        while (true) {
            System.out.print("请您输入账户密码：");
            String passWord = sc.next();
            System.out.print("请您再次输入密码：");
            String okPassWord = sc.next();
            if (passWord.equals(okPassWord)) {
                //密码一样，注入给账户对象
                account.setPassWord(okPassWord);
                break;  //跳出循环
            } else {
                System.out.println("对不起，您两次输入的密码不一致，请重新输入：");
            }
        }

        System.out.print("请您输入账户限额：");
        double quotaMoney = sc.nextDouble();
        account.setQuotaMoney(quotaMoney);

        //为账户随机一个八位卡号，且与其它账号不重复
        String cardId = getRandomCardId(accounts);
        account.setCardId(cardId);

        //3.把账户对象添加到账户集合中去
        accounts.add(account);
        System.out.println("恭喜您，" + userName + ((sex == '男') ? "先生" : "女士") + "您开户成功，您的卡号是：" + cardId + ",请您妥善保管！");

    }

    //为账户生成卡号
    private static String getRandomCardId(ArrayList<Account> accounts) {
        Random r = new Random();
        while (true) {
            //1.先生成八位卡号
            String cardId = "";

            for (int i = 0; i < 8; i++) {
                cardId += r.nextInt(10);
            }

            //2.判断是否重复
            Account acc = getAccoutByCardId(accounts, cardId);
            if (acc == null) {
                //没有账户，可以直接用
                return cardId;
            }
        }
    }

    //本地方法，在集合中根据卡号查询账户
    private static Account getAccoutByCardId(ArrayList<Account> accounts, String cardId) {
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            if (acc.getCardId().equals(cardId)) {
                return acc;
            }
        }
        return null;
    }

}
