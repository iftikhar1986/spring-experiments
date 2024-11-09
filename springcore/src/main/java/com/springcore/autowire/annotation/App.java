package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        // Load the Spring context from the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/annotation/applicationContext.xml");

        // Retrieve the 'employee' bean
        Employee employee = (Employee) context.getBean("employee");

        // Display the employee's address to verify autowiring
        System.out.println("Employee's Address: " + employee.getAddress());

        // Close the context to release resources
        ((ClassPathXmlApplicationContext) context).close();
    }
}
 