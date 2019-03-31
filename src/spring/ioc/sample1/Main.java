package spring.ioc.sample1;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory
                (new ClassPathResource( "spring/ioc/sample1/Beans.xml"));
        HelloWorld obj = (HelloWorld) factory.getBean("HelloWorld");
        obj.getMessage();
    }
}
