package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// Load the Spring application context from the XML configuration file
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    	// Retrieve the Student bean by its id
    	Student student = (Student) context.getBean("studentBean");

    	// Use the Student object
    	System.out.println(student);
    }
}
