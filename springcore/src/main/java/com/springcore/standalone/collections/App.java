package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        // Load the Spring context from the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/applicationContext.xml");

        // Retrieve the 'person' bean from the context
        Person person = context.getBean("person", Person.class);

        // Print the list of friends to verify injection
        System.out.println("Friends List: " + person.getFriends());
        System.out.println("Fees Structure: " + person.getFeestructure());
        System.out.println("Properties: " + person.getProperties());

        // Close the context
        ((ClassPathXmlApplicationContext) context).close();
    }
}
