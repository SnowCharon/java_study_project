package IO;

import java.io.*;

/**
 * @author MOYU
 * @File JavaSE_Study-IO
 * @Date 2022/6/11 20:26
 **/
public class GeneralCompareBuffer {
    public static void main(String[] args) throws IOException {
        File data = new File("D:\\JAVA\\Code\\JavaSE_Study\\JavaSE_ Advanced\\src\\IO\\诸葛亮.txt");
        File a = new File("D:\\JAVA\\Code\\JavaSE_Study\\JavaSE_ Advanced\\src\\IO\\好耶.txt");
        File b = new File("D:\\JAVA\\Code\\JavaSE_Study\\JavaSE_ Advanced\\src\\IO\\玛卡巴卡.txt");

        StringBuilder sb = new StringBuilder();

        long start = System.currentTimeMillis();
        copy(data, a);
        long end = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        bufferedCopy(data, b);
        long end2 = System.currentTimeMillis();

        System.out.println("普通字节流耗时：" + (end - start) + " ms");
        System.out.println("缓冲字节流耗时：" + (end2 - start2) + " ms");
    }

    // 普通字节流
    public static void copy(File in, File out) throws IOException {
        // 封装数据源
        InputStream is = new FileInputStream(in);
        // 封装目的地
        OutputStream os = new FileOutputStream(out);

        int by = 0;
        while ((by = is.read()) != -1) {
            os.write(by);
        }
        is.close();
        os.close();
    }

    // 缓冲字节流
    public static void bufferedCopy(File in, File out) throws IOException {
        // 封装数据源
        BufferedInputStream bi = new BufferedInputStream(new FileInputStream(in));
        // 封装目的地
        BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(out));

        int by = 0;
        while ((by = bi.read()) != -1) {
            bo.write(by);
        }
        bo.close();
        bi.close();

    }
}
