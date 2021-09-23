package com.emerje.restapi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Application.class);
        NavigationSystem navigationSystem = applicationContext.getBean(NavigationSystem.class);

        navigationSystem.getItinary();
    }
}