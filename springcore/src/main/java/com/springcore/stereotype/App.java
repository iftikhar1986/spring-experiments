package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        // Load the Spring context from the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/applicationContext.xml");

        // Retrieve the Student bean from the context
        Student student = (Student) context.getBean("student");
        Student student1 = (Student) context.getBean("student");
        
        Teacher teacher = (Teacher) context.getBean("teacher");
        Teacher teacher2 = (Teacher) context.getBean("teacher");

        
        System.out.println(teacher.hashCode());
        System.out.println(teacher2.hashCode());


        System.out.println("===========================");


        // Display the student object
        System.out.println(student.hashCode());
        
        
        System.out.println(student1.hashCode());
        
        // Close the context to release resources
        ((ClassPathXmlApplicationContext) context).close();
    }
}
