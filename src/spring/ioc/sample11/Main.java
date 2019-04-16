package spring.ioc.sample11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(Student.class);
        Student student = ctx.getBean(Student.class);
        student.setFavoriteFoods(Arrays.asList(new String[]{"豆腐", "西红柿"}));
        student.setName("李华超");
        HashMap<String, String> map = new HashMap<>();
        map.put("父亲", "李某某");
        student.setRelationship(map);
        System.out.println(student);
    }
}
