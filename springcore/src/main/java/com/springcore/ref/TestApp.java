package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collections.Employee;

public class TestApp {

	public static void main(String[] args) {
		
	    	// Load the Spring application context from the XML configuration file
	    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refapplicationContext.xml");


	    	 // Retrieve the beans from the Spring container
	        A a = (A) context.getBean("a");

	        // Print the properties of bean 'a', which will also print the injected 'obj' (bean 'b')
	        System.out.println(a);	
	    

	}

}
