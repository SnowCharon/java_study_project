package String;

import java.util.Random;

/**
 * @author 竹玄羽
 * @File String
 * @date 2022/5/19  22:43
 **/
public class Verification_code {
    public static void main(String[] args) {
        //1.定义数组
        String data = "abcdefghigklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        System.out.println(data.length());

        //2.循环五次，每次生成随即索引，提取字符
        String code = "";
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            //随机一个索引
            int index = r.nextInt(data.length());
            char ch = data.charAt(index);
            code += ch;
        }
        //3.输出
        System.out.println(code);
    }

}
