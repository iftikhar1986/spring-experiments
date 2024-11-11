package com.springjdbc.dao;

import java.util.List;

import com.springjdbc.entities.Student;

public interface StudentDao {
    
    // Method to insert a new student record
    public int insert(Student student);
    
    // Method to update an existing student record
    public  int update(Student student);
    
    // Method to delete a student record by ID
    public int delete(int id);
    
    // Method to retrieve a student record by ID
    public Student getStudent(int id);
    
    // Method to retrieve all student records
    public List<Student> getAllStudents();
}
