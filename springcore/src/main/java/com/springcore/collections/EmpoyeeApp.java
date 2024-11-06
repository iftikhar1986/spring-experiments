package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class EmpoyeeApp 
{
    public static void main( String[] args )
    {
    	// Load the Spring application context from the XML configuration file
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/employeeapplicationContext.xml");


        // Retrieve the Employee bean from the Spring context
        Employee employee = (Employee) context.getBean("employeeBean");

        // Display the Employee bean properties
        System.out.println(employee);    	
    }
}
