package XML_study;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author MOYU
 * @File JavaSE_Study-XML_study
 * @Date 2022/7/6 16:15
 **/
public class XmlParse {
    public static void main(String[] args) throws Exception {
        //1.获取一个解析器对象
        SAXReader saxReader = new SAXReader();
        //2.利用解析器，加载xml加载到内存中，并返回一个对象
        Document document = saxReader.read(new File("D:\\JAVA\\Code\\JavaSE_Study\\JavaSE_ Advanced\\src\\XML_study\\xml_study.xml"));
        //3.获取根标签
        Element rootElement = document.getRootElement();
        //4.通过根标签获取次级标签
        //element():获取调用者所有子标签，放到一个集合中，返回集合
        //List<Element> list = rootElement.elements();
        //element("标签名"):获取标签名的子标签，放到一个集合中，返回集合
        List<Element> studentList = rootElement.elements("people");
        //存储学生对象
        ArrayList<Student> list = new ArrayList<>();
        //System.out.println(list.size());
        //5.遍历每一个
        for (Element element : studentList) {
            //获取属性
            Attribute attribute = element.attribute("id");
            //获取id属性值
            String id = attribute.getValue();
            //获取name标签
            Element nameElement = element.element("name");
            //获取标签的标签体
            String name = nameElement.getText();
            //获取age标签
            Element ageElement = element.element("age");
            //获取标签的标签体
            String age = ageElement.getText();
           /* //获取score标签
            Element scoreElement = element.element("score");
            //获取标签的标签体
            String score = scoreElement.getText();*/

//            System.out.println(id + "  " + name + "  " + age);

            Student student = new Student(id, name, Integer.parseInt(age));
            list.add(student);
        }

        //遍历
        for (Student student : list) {
            System.out.println(student);
        }
//        list.forEach();
    }
}
