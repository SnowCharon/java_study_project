package IO.charStream;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * @author MOYU
 * @File JavaSE_Study-IO.charstream
 * @Date 2022/6/10 14:16
 **/
public class Dome {
    public static void main(String[] args) throws UnsupportedEncodingException {
        method1();

        method2();

    }

    private static void method2() throws UnsupportedEncodingException {
        //解码
        byte[] byte1 = {-26, -120, -111, -25, -120, -79, -28, -72, -83, -27, -101, -67};
        byte[] byte2 = {-50, -46, -80, -82, -42, -48, -71, -6};

        String s1 = new String(byte1);
        String s2 = new String(byte2,"GBK");

        System.out.println(s1);
        System.out.println(s2);
    }

    private static void method1() throws UnsupportedEncodingException {
        //编码
        String s = "我爱中国";
        byte[] bytes1 = s.getBytes();
        System.out.println(Arrays.toString(bytes1));

        byte[] bytes2 = s.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(bytes2));

        byte[] bytes3 = s.getBytes("GBK");
        System.out.println(Arrays.toString(bytes3));
    }
}
