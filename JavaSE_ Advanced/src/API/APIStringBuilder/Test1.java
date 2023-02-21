package API.APIStringBuilder;

/**
 * @author MOYU
 * @File JavaSE_Study-API_StringBuilder
 * @Date 2022/5/29 9:51
 **/
public class Test1 {
    public static void main(String[] args) {
        /*
        字符串内容固定时使用String
        字符串内容需要修改，拼接的时候需要StringBuilder
         */
        StringBuilder s = new StringBuilder();
        s.append('a');
        System.out.println(s);

        StringBuilder s2 = new StringBuilder();
        //支持链式编程
        s2.append(5).append('a').append("清澈的爱只为中国！");
        System.out.println(s2);

        //反转
        s2.reverse().append("好耶！");
        System.out.println(s2);

        //字符长度
        System.out.println(s2.length());

        //注意：StringBuilder只是手段，最后还是要将它变为String类型
        StringBuilder str = new StringBuilder();
        str.append("123").append("456");
        //恢复为String
        String cxx = str.toString();
        check(cxx);

    }

    private static void check(String cxx) {
        System.out.println(cxx);
    }
}
