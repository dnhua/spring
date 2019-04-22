package spring.aop.sample1;

public class Student {
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        System.out.println("Name : " + name );
        return name;
    }
    public void desc() {
        System.out.println("我的名字是"+name);
        System.out.println("来自东南大学");
    }
}
