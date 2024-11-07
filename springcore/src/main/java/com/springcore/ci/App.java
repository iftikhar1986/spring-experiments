package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Load the Spring context from the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/ciapplicationContext.xml");

        // Retrieve the 'person' bean
        Person person = (Person) context.getBean("person");

        // Print the person details
        System.out.println(person);
    }
}
