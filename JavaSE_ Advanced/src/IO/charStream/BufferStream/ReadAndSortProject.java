package IO.charStream.BufferStream;

import java.io.*;
import java.util.Arrays;

/**
 * @author MOYU
 * @File JavaSE_Study-IO.charStream.BufferStream
 * @Date 2022/6/10 18:01
 **/
public class ReadAndSortProject {
    public static void main(String[] args) throws IOException {
        //1.把数据读进来
        BufferedReader br = new BufferedReader(new FileReader("D:\\JAVA\\Code\\JavaSE_Study\\JavaSE_ Advanced\\src\\IO\\charStream\\b.txt"));
        //输出流写在这里是大错特错
        //BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\JAVA\\Code\\JavaSE_Study\\JavaSE_ Advanced\\src\\IO\\charStream\\b.txt"));

        String line = br.readLine();
        System.out.println("读取到的：" + line);

        //2.排序
        //空格切割
        String[] strings = line.split(" ");
        //类型转换
        int[] arr = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            //转换
            arr[i] = Integer.parseInt(strings[i]);
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //3.把排序结果返回到本地
        //这个不能提前创建，如果写在前面，会将文件的内容清空
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\JAVA\\Code\\JavaSE_Study\\JavaSE_ Advanced\\src\\IO\\charStream\\b.txt"));
        for (int i : arr) {
            bw.write(i + " ");
        }

        //关闭文件，释放资源
        br.close();
        bw.close();
    }
}
