# 基于构造函数的依赖注入

1. 新建School类
2. 新建Student类
3. 新建Beans.xml
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">

    <bean id="Student" class="spring.ioc.sample3.Student">
        <constructor-arg ref="School"></constructor-arg>
        <constructor-arg type="java.lang.String" value="李华超"></constructor-arg>
    </bean>

    <bean id="School" class="spring.ioc.sample3.School">
        <property name="name" value="东南大学"/>
    </bean>
</beans>
```
4. 编写测试类Main