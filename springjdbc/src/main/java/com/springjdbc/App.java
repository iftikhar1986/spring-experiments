package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.entities.Student;

public class App {

    public static void main(String[] args) {

        System.out.println("Program Started.....!");

        // Load the Spring context from the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springjdbc/applicationContext.xml");

        // Get the StudentDao bean from the context
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

//        // Create a new student object
//        Student student = new Student(); 
//        student.setId(113);
//        student.setName("Syed Hussain");
//        student.setCity("Wakra");
// 
//        // Insert the new student into the database
//        int result = studentDao.insert(student);
//
//        // Check the result of the insert operation
//        if (result > 0) {
//            System.out.println("A new student has been inserted successfully!");
//        } else {
//            System.out.println("Failed to insert the student.");
//        }

        
     // Update a student object
//        Student student = new Student(); 
//        student.setId(111);
//        student.setName("Syed Iftikhar Bukari");
//        student.setCity("Al-Wakra");
//        
//        int result = studentDao.update(student);
//        
//        
//     // Check if the result is updated 
//      if (result > 0) {
//          System.out.println("A student has been Updated successfully!");
//      } else {
//          System.out.println("Failed to Update the student.");
//      }
      
      
      // Delete a student object
      
      
      int result = studentDao.delete(113);
      
      
   // Check if the result is updated 
    if (result > 0) {
        System.out.println("A student has been Deleted successfully!");
    } else {
        System.out.println("Failed to Delete the student.");
    }
        
        
        
        // Close the Spring context
        ((ClassPathXmlApplicationContext) context).close();
    }
}
