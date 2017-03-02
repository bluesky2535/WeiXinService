package com.twx.test;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
/**
 * dom4j���÷�
 * @author twx
 *
 */
public class Dom4j {
	public static void main(String[] args) throws DocumentException {
		SAXReader reader = new SAXReader();
        File file = new File("books.xml");
        Document document = reader.read(file);
        Element root = document.getRootElement();
        List<Element> childElements = root.elements();
        
        for (Element child : childElements) {
            //δ֪�����������
            /*List<Attribute> attributeList = child.attributes();
            for (Attribute attr : attributeList) {
                System.out.println(attr.getName() + ": " + attr.getValue());
            }*/
             
            //��֪�����������
//            System.out.println("id: " + child.attributeValue("id"));
            System.out.println("name: " + child.getName());
            System.out.println("text: " + child.getText());
             
            //δ֪��Ԫ���������
            /*List<Element> elementList = child.elements();
            for (Element ele : elementList) {
                System.out.println(ele.getName() + ": " + ele.getText());
            }
            System.out.println();*/
             
            //��֪��Ԫ����������
//            System.out.println("title" + child.elementText("title"));
//            System.out.println("author" + child.elementText("author"));
            //������Ϊ�˸�ʽ�����۶����
            System.out.println();
        }
	}
}
