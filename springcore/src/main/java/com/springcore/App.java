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
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/studentapplicationContext.xml");

    	// Retrieve the Student bean by its id
    	Student firstStudentBean = (Student) context.getBean("firstStudentBean");
    	Student secondStudentBean = (Student) context.getBean("secondStudentBean");

    	
    	// Use the Student object
    	System.out.println(firstStudentBean);
    	System.out.println(secondStudentBean);

    }
}
