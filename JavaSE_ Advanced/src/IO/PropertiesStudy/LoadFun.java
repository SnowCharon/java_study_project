package IO.PropertiesStudy;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author MOYU
 * @File JavaSE_Study-IO.PropertiesStudy
 * @Date 2022/6/11 19:28
 **/
public class LoadFun {
    public static void main(String[] args) throws IOException {
        //注：该方法用于写配置文件，因此文件后缀比较特殊
        //将本地文件中的键值对数据读取到集合中

        //读取
        Properties properties = new Properties();
        FileReader fileReader = new FileReader("D:\\JAVA\\Code\\JavaSE_Study\\JavaSE_ Advanced\\src\\IO\\PropertiesStudy\\proper.properties");
        properties.load(fileReader);
        fileReader.close();
        System.out.println(properties);
    }
}
