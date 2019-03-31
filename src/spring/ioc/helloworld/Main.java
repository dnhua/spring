package spring.ioc.helloworld;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory
                (new ClassPathResource("spring/ioc/helloworld/Beans.xml"));
        HelloWorld obj = (HelloWorld) factory.getBean("HelloWorld");
        obj.getMessage();
    }
}
