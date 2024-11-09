package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        // Load the Spring context from the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/applicationContext.xml");

        // Retrieve the Student bean from the context
        Student student = (Student) context.getBean("student");

        // Display the student object
        System.out.println(student);
        
        // Close the context to release resources
        ((ClassPathXmlApplicationContext) context).close();
    }
}
