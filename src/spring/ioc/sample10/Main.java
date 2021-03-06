package spring.ioc.sample10;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/ioc/sample10/Beans.xml");
        Student obj = (Student) context.getBean("Student");
        obj.desc();
    }
}
