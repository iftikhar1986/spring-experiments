package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        // Load the Spring context using annotation-based configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the 'student' bean
        Student student = context.getBean("getStudent", Student.class);
        
        System.out.println(student);

        // Close the context
        ((AnnotationConfigApplicationContext) context).close();
    }
}
