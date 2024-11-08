package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        // Load the Spring context from the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/tapplicationContext.xml");

        // Retrieve the 'triangularPastry' bean
        TriangularPastry pastry = (TriangularPastry) context.getBean("triangularPastry");

        // Display the price to verify injection
        System.out.println("The price of the Triangular Pastry is: $" + pastry.getPrice());
        
        // Close the context to release resources
        ((ClassPathXmlApplicationContext) context).close();
    }
}
