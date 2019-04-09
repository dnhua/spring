package spring.ioc.sample8;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory
                (new ClassPathResource( "spring/ioc/sample8/Beans.xml"));
        Student obj = (Student) factory.getBean("Student");
        obj.desc();
    }
}
