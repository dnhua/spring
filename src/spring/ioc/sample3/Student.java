package spring.ioc.sample3;

public class Student {
    private School school;
    private String name;
    public Student(School school, String name) {
        System.out.println("学生类初始化");
        this.school = school;
        this.name = name;
    }
    public void desc(){
        System.out.println("我的名字是："+name);
        System.out.println("来自"+school.desc());
    }
}
