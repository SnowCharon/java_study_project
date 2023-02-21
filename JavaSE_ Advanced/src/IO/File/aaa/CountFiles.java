package IO.File.aaa;

import java.io.File;
import java.util.HashMap;

/**
 * @author MOYU
 * @File JavaSE_Study-IO.File.aaa
 * @Date 2022/6/8 20:08
 **/
public class CountFiles {
    public static void main(String[] args) {
        //统计一个文件夹中没种文件出现的次数
        //如果用变量来统计每次只能统计一种
        //可以利用map集合来统计，键--文件名后缀，值--次数
        File file = new File("E:\\Desktop");
        HashMap<String, Integer> hm = new HashMap<>();
        getCount(hm, file);
        System.out.println(hm);
    }

    private static void getCount(HashMap<String, Integer> hm, File file) {
        //1.进入
        File[] files = file.listFiles();
        //2.遍历
        for (File f : files) {
            if (f.isFile()) {
                String fileName = f.getName();
                //不考虑无后缀或者多级名称
                String[] nameArr = fileName.split("\\.");
                if (nameArr.length == 2) {
                    String endName = nameArr[1];
                    if (hm.containsKey(endName)) {
                        //在hm集合中查找该类型后缀是否存在，if中是存在
                        Integer count = hm.get(endName);
                        //当这种文件再次出现，次数加1
                        count++;
                        hm.put(endName,count);
                    } else {
                        //else中是不存在，表示当前这种文件第一次出现
                        hm.put(endName, 1);
                    }
                }
            } else {
                getCount(hm, f);
            }
        }
    }
}
