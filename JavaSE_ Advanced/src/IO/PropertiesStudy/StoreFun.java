package IO.PropertiesStudy;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author MOYU
 * @File JavaSE_Study-IO.PropertiesStudy
 * @Date 2022/6/11 19:35
 **/
public class StoreFun {
    public static void main(String[] args) throws IOException {
        //将集合数据以键值对形式保存到本地
        Properties properties = new Properties();
        properties.put("张三","123456");
        properties.put("王五","Hello");
        properties.put("李四","World");

        FileWriter fileWriter = new FileWriter("D:\\JAVA\\Code\\JavaSE_Study\\JavaSE_ Advanced\\src\\IO\\PropertiesStudy\\proper.properties");

        //第一个参数是字符输出流，第二个参数是会被写入到文件的注释--给null也可以
        properties.store(fileWriter,"好耶！");
        fileWriter.close();
    }
}
