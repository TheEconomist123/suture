package com.itheima.demo22;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.net.URL;
import java.util.List;

//Xpath解析
public class XpathXml {

    public static void main(String[] args) throws DocumentException {

        SAXReader saxReader = new SAXReader();
        URL resource = XpathXml.class.getClassLoader().getResource("cc/students.xml");
        Document read = saxReader.read(resource);
        Element element = (Element) read.selectSingleNode("/students/student/name");
        String text = element.getText();
        System.out.println("text = " + text);
        Element node = (Element) element.selectSingleNode("../id");
        System.out.println(node.getText());
        System.out.println("---------------------");
        List<Node> nodes = read.selectNodes("//name");
        for (Node node1 : nodes) {
            Element element1 = (Element) node1;
            System.out.println(element1.getText());

        }


    }
}
