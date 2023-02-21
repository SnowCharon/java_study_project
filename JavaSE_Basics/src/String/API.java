package String;

/**
 * @author 竹玄羽
 * @File String
 * @date 2022/5/19  21:19
 **/
public class API {
    public static void main(String[] args) {
        //1.public int length();
        String name = "我爱你中国love";
        System.out.println(name);

        //2.public char charAt(int index);   获取某个索引位置的字符
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            System.out.println(ch);
        }

        //3.public char[] toCharArray();    把字符串转换成字符数组
        char[] chars = name.toCharArray();
        for (int i = 0; i < chars.length; i++) {
          char ch = chars[i];
            System.out.println(ch);
        }

        //4.public String substring(int beginIndex, int endIndex)   截取内容包前不报后
        String name2 = "Java是最厉害的编程语言";
        String rs = name2.substring(0,6);
        System.out.println(rs);

        //5.public String substring(int beginIndex) 从当前索引一直截取到最后
        //6.public String replace(CharSequence targe, CharSequence replacement)
        //后者替换前者
        String love = name.replace("中国","董佳杰");
        System.out.println(love);

        //7.public boolean contains(CharSequence s) 检测有没有包含
        System.out.println(name.contains("中国"));
        System.out.println(name.contains("董佳杰"));

        //8.public boolean startsWith(String prefix)  看有没有以该字符开头
        System.out.println(name.startsWith("我"));
        System.out.println(name.startsWith("我爱你"));
        System.out.println(name.startsWith("中国"));

        //9.public String[] split(String s)  按照某个内容把字符串分割成字符串数组返回
        String names = "胡歌,王宝强,甄子丹,吴京";
        String[] nameChar = names.split(",");
        for (int i = 0; i < nameChar.length; i++) {
            System.out.println(nameChar[i]);
        }
    }
}
