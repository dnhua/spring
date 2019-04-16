package spring.ioc.sample11;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfit {
    @Bean
    public Student student(){
        return new Student();
    }
}
