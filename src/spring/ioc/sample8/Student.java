package spring.ioc.sample8;

public class Student {
    private School school;
    private String name;
    public Student(String name, School school) {
        System.out.println("学生类初始化");
        this.school = school;
        this.name = name;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public void desc(){
        System.out.println("我的名字是："+name);
        System.out.println("来自"+school.desc());
    }
}
