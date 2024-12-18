package com.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.entities.Student;

public class App {

    public static void main(String[] args) {

        System.out.println("Program Started.....!");

        // Load the Spring context from the XML configuration file
//        ApplicationContext context = new ClassPathXmlApplicationContext("com/springjdbc/applicationContext.xml");

        
        // Load the Spring context using the AppConfig class
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);

        // Get the StudentDao bean
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
      
//      
//      int result = studentDao.delete(113);
//      
//      
//   // Check if the result is updated 
//    if (result > 0) {
//        System.out.println("A student has been Deleted successfully!");
//    } else {
//        System.out.println("Failed to Delete the student.");
//    }
//    
//    

        
//      Student student =  studentDao.getStudent(112);
//    
// // Check if the result is updated 
// 
//      System.out.println(student);
  
        
     // Retrieve all students
//        System.out.println("List of all students:");
//        studentDao.getAllStudents().forEach(System.out::println);
        
        
     // Retrieve and print all students
        List<Student> students = studentDao.getAllStudents();
        System.out.println("List of all students:");
        for (Student s : students) {
            System.out.println(s);
        }

        
        
        // Close the Spring context
      //  ((ClassPathXmlApplicationContext) context).close();
        
        // Close the context if needed (optional for AnnotationConfigApplicationContext)
        ((AnnotationConfigApplicationContext) context).close();
    }
}
