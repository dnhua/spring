package spring.aop.sample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring/aop/sample1/beans.xml");
        Student student = (Student) context.getBean("student");
        student.desc();
    }
}
