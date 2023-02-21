package ATMProject;

/**
 * @author 竹玄羽
 * @File ATMProject
 * @date 2022/5/21  15:12
 * 账户类
 **/
public class Account {
    private String cardId;      //卡号
    private String userName;    //用户名
    private String passWord;    //密码
    private String telephone;   //手机号
    private char sex;           //性别
    private double money;       //账户余额
    private double quotaMoney;  //每次取现额度
    private int age;            //年龄

    public Account() {
    }

    public Account(String cardId, String userName, String passWord, String telephone, char sex, double money, double quotaMoney, int age) {
        this.cardId = cardId;
        this.userName = userName;
        this.passWord = passWord;
        this.telephone = telephone;
        this.sex = sex;
        this.money = money;
        this.quotaMoney = quotaMoney;
        this.age = age;
    }


    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getQuotaMoney() {
        return quotaMoney;
    }

    public void setQuotaMoney(double quotaMoney) {
        this.quotaMoney = quotaMoney;
    }
}
