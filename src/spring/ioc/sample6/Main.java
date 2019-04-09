package spring.ioc.sample6;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory
                (new ClassPathResource( "spring/ioc/sample6/Beans.xml"));
        Student obj = (Student) factory.getBean("Student");
        obj.desc();
    }
}
