package spring.ioc.sample3;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import spring.ioc.sample2.HelloWorld2;

public class Main {
    public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory
                (new ClassPathResource( "spring/ioc/sample3/Beans.xml"));
        Student obj = (Student) factory.getBean("Student");
        obj.desc();
    }
}
