package spring.ioc.sample10;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    private School school;
    private String name;
    public Student(String name) {
        System.out.println("学生类初始化");
        this.name = name;
    }

    public School getSchool() {
        return school;
    }

    @Autowired
    public void setSchool(School school) {
        this.school = school;
    }

    public void desc(){
        System.out.println("我的名字是："+name);
        System.out.println("来自"+school.desc());
    }
}
