package com.atguigu.myssm.ioc;

import com.atguigu.myssm.Util.StringUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @title: ClassPathXmlApplicationcontext
 * @Author 竹玄羽
 * @Date: 2022/8/30 16:01
 */
public class ClassPathXmlApplicationContext implements BeanFactory {
    private final Map<String, Object> beanMap = new HashMap<>();
    private final String path = "applicationContext.xml";

    public ClassPathXmlApplicationContext(){
        this("applicationContext.xml");
    }


    public ClassPathXmlApplicationContext(String path) {
        if (StringUtil.isEmpty(path)){
            throw new RuntimeException("IOC容器配置文件没有指定！");
        }
        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(path);
            //1.创建DocumentBuilderFactory
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            //2.创建DocumentBuilder对象
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            //3.创建Document对象
            Document document = documentBuilder.parse(inputStream);

            //4.获取所有的bean节点
            NodeList beanNodeList = document.getElementsByTagName("bean");
            for (int i = 0; i < beanNodeList.getLength(); i++) {
                Node beanNode = beanNodeList.item(i);
                if (beanNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element beanElement = (Element) beanNode;
                    String beanId = beanElement.getAttribute("id");
                    String className = beanElement.getAttribute("class");
                    Class<?> beanClass = Class.forName(className);
                    //创建bean实例
                    Object beanObj = beanClass.newInstance();
                    //保存bean到Map集合
                    beanMap.put(beanId, beanObj);
                    //还没设置bean与bean之间的依赖关系
                }
            }
            //组装bean之间的依赖关系
            for (int i = 0; i < beanNodeList.getLength(); i++) {
                Node beanNode = beanNodeList.item(i);
                if (beanNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element beanElement = (Element) beanNode;
                    String beanId = beanElement.getAttribute("id");
                    NodeList beanChildNodeList = beanElement.getChildNodes();
                    for (int j = 0; j < beanChildNodeList.getLength(); j++) {
                        Node beanChildNode = beanChildNodeList.item(j);
                        if (beanChildNode.getNodeType() == Node.ELEMENT_NODE && "property".equals(beanChildNode.getNodeName())) {
                            Element propertyElement = (Element) beanChildNode;
                            String propertyName = propertyElement.getAttribute("name");
                            String propertyRef = propertyElement.getAttribute("ref");

                            //找到propertyRef的实例
                            Object refObject = beanMap.get(propertyRef);
                            //将refObject设置到当前bean对应的实例的property属性上去
                            Object beanObject = beanMap.get(beanId);
                            Class<?> beanClass = beanObject.getClass();
                            Field propertyField = beanClass.getDeclaredField(propertyName);
                            propertyField.setAccessible(true);
                            propertyField.set(beanObject,refObject);
                        }
                    }
                }
            }

        } catch (ParserConfigurationException | SAXException | IOException | IllegalAccessException |
                 InstantiationException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Object getBean(String id) {
        return beanMap.get(id);
    }
}
