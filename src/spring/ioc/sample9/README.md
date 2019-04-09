# 依赖注入-集合
```java
@Required
    public void setName(String name) {
        this.name = name;
    }

    public List<String> getFavoriteFoods() {
        return favoriteFoods;
    }
    @Required
    public void setFavoriteFoods(List<String> favoriteFoods) {
        this.favoriteFoods = favoriteFoods;
    }

    public Map<String, String> getRelationship() {
        return relationship;
    }
    @Required
    public void setRelationship(Map<String, String> relationship) {
        this.relationship = relationship;
    }
```
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans-3.0.xsd http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd">
    <context:annotation-config/>
    <bean id="Student" class="spring.ioc.sample9.Student">
        <property name="favoriteFoods">
            <list>
                <value>大米</value>
                <value>黄焖鸡</value>
                <value>重庆小面</value>
                <value>猪蹄</value>
            </list>
        </property>
        <property name="name" value="李华超" />
        <property name="relationship">
            <map>
                <entry key="老妈" value="涂双平" />
                <entry key="老爸" value="李爱国" />
            </map>
        </property>
    </bean>
</beans>
```