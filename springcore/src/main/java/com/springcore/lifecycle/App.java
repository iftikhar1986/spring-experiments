package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        // Load the Spring context from the XML configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/tapplicationContext.xml");

        // Close the context to trigger the destroy methods
        context.registerShutdownHook();
        
        // Retrieve the 'triangularPastry' bean
//        TriangularPastry pastry = (TriangularPastry) context.getBean("triangularPastry");

        // Display the price of the Triangular Pastry to verify injection
//        System.out.println("The price of the Triangular Pastry is: $" + pastry.getPrice());

        // Retrieve the 'pepsi' bean
//        Pepsi pepsi = (Pepsi) context.getBean("pepsi");

        // Display the price of the Pepsi to verify injection
//        System.out.println("The price of the Pepsi is: $" + pepsi.getPrice());
        
        Course course  = (Course) context.getBean("course");
        
        System.out.println(course);


      
    }
}
