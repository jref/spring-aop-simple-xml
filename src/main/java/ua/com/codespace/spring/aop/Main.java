package ua.com.codespace.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.com.codespace.spring.aop.model.Door;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Door door = applicationContext.getBean(Door.class);
        door.open();
        applicationContext.close();
    }
}
