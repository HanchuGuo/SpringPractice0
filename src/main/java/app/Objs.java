package app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Objs {
    @Bean
    public User get(){
        return new User();
    }
}
