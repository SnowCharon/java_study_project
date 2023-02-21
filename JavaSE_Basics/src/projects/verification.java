package projects;

import java.util.Random;

/**
 * @author 竹玄羽
 * @File projects
 * @date 2022/5/15  20:27
 **/
public class verification {
    public static void main(String[] args) {
        String code = createCode(5);
        System.out.println(code);
    }
    //1.定义一个方法获取验证码
    public static String createCode(int n) {
        //2.定义一个字符串接收验证码
        String code = "";
        Random r = new Random();
        //3.循环随机生成
        for (int i = 0; i < n; i++) {
            int type = r.nextInt(3);
            switch (type) {
                case 0:
                    //大写字符（A 65 - Z 65+26)
                    char ch1 = (char)(r.nextInt(26) + 65);
                    code += ch1;
                    break;
                case 1:
                    //小写字符 （a 97 - z 97+26）
                    char ch2 = (char)(r.nextInt(26) + 97);
                    code += ch2;
                    break;
                case 2:
                    //数字 0-9
                    code += r.nextInt(10);
                    break;
            }

        }
        return code;
    }

}
