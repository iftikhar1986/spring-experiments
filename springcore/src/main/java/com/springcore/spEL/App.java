package com.springcore.spEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class App {

    public static void main(String[] args) {
        // Load the Spring context from the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spEL/applicationContext.xml");

        // Retrieve the 'demo' bean
        Demo demo = (Demo) context.getBean("demo");

        // Display the values of x and y to verify injection
        System.out.println("Demo Bean: " + demo);
        
        
     // Create a new SpelExpressionParser instance
        SpelExpressionParser parser = new SpelExpressionParser();

        // Example 1: Simple arithmetic expression
        Expression expression1 = parser.parseExpression("10 + 20");
        int result1 = expression1.getValue(Integer.class);
        System.out.println("Result of 10 + 20: " + result1);
        
        
        
        

        // Close the context to release resources
        ((ClassPathXmlApplicationContext) context).close();
    }
}
