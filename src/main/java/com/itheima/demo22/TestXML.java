package com.itheima.demo22;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

//测试xml读取
//xml 是用来传输数据，存储数据的。
public class TestXML {

    public static void main(String[] args) throws DocumentException {


        SAXReader sr = new SAXReader();
        //  URL resource = TestXML.class.getClassLoader().getResource("students.xml");
        InputStream resource = TestXML.class.getClassLoader().getResourceAsStream("cc/students.xml");
        Document read = sr.read(resource);

        Element rootElement = read.getRootElement();

        List<Student> students = new ArrayList<>();

        List<Element> elements = rootElement.elements();
        for (Element element : elements) {
            List<Element> elements1 = element.elements();
            Student student = new Student();
            int id = Integer.parseInt(elements1.get(0).getTextTrim());
            String name = elements1.get(1).getTextTrim();
            String addr = elements1.get(2).getTextTrim();
            student.setId(id);
            student.setName(name);
            student.setAddr(addr);
            students.add(student);
        }
        System.out.println("students = " + students);

    }
}
