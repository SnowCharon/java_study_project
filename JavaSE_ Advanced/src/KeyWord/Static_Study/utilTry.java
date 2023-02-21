package KeyWord.Static_Study;

import java.util.Random;

/**
 * @author 竹玄羽
 * @File Static_Util
 * @date 2022/5/22  19:39
 **/
public class utilTry {
/*
工具类无需创建对象，将其构造器私有化显得专业
 */
    private utilTry(){
    }

    //静态方法
    public static void returnCode(int n) {
        //1.定义数组
        String data = "abcdefghigklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        System.out.println(data.length());

        //2.循环五次，每次生成随即索引，提取字符
        String code = "";
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            //随机一个索引
            int index = r.nextInt(data.length());
            char ch = data.charAt(index);
            code += ch;
        }
        //3.输出
        System.out.println(code);
    }

}
