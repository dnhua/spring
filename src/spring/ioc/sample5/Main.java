package spring.ioc.sample5;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory
                (new ClassPathResource( "spring/ioc/sample5/Beans.xml"));
        Student student = (Student) factory.getBean("Student");
        System.out.println(student);
    }
}
