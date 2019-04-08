package spring.ioc.sample2;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory
                (new ClassPathResource( "spring/ioc/sample2/Beans.xml"));
        HelloWorld2 obj = (HelloWorld2) factory.getBean("HelloWorld");
        obj.getMessage();
    }
}
