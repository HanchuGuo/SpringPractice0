package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Entry {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        container.getBean(C.class).doS();
    }
}
