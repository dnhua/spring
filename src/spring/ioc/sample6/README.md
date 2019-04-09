# byName
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">

    <bean id="Student" class="spring.ioc.sample6.Student" autowire="byName">
        <constructor-arg type="java.lang.String" value="李华超"></constructor-arg>
    </bean>

    <bean id="school" class="spring.ioc.sample6.School">
        <property name="name" value="东南大学"/>
    </bean>
</beans>
```
需要注意的是 <bean id="school" class="spring.ioc.sample6.School"> 这里是school要和public void setSchool(School school) {this.school = school;}里面的school一致
