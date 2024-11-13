package com.springorm.dao;

import java.util.List;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;
import com.springorm.entities.Student;

public class StudentDao {
    
    // HibernateTemplate instance for handling database operations
    private HibernateTemplate hibernateTemplate;

    // Setter method for HibernateTemplate, allowing dependency injection by Spring
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    /**
     * Inserts a new student record into the database.
     * @param student - Student entity to insert.
     * @return - Returns the generated ID of the saved student.
     */
    @Transactional // Ensures that the insert operation is done within a transaction
    public int insert(Student student) {
        // Save the student entity to the database and return the generated ID
        Integer saveStudent = (Integer) this.hibernateTemplate.save(student);
        return saveStudent; // Return the student ID after insertion
    }

    /**
     * Updates an existing student record in the database.
     * @param student - Student entity with updated values.
     */
    @Transactional // Ensures that the update operation is transactional
    public void update(Student student) {
        // Update the student entity in the database
        this.hibernateTemplate.update(student);
    }

    /**
     * Deletes a student record from the database by its ID.
     * @param studentId - The ID of the student to delete.
     */
    @Transactional // Ensures that the delete operation is transactional
    public void delete(int studentId) {
        // Retrieve the student entity by its ID
        Student student = this.hibernateTemplate.get(Student.class, studentId);
        // If the student exists, delete it from the database
        if (student != null) {
            this.hibernateTemplate.delete(student);
        }
    }

    /**
     * Retrieves a student record from the database by its ID.
     * @param studentId - The ID of the student to retrieve.
     * @return - Returns the Student entity if found; otherwise, null.
     */
    public Student getStudent(int studentId) {
        // Fetch the student entity by its ID
        return this.hibernateTemplate.get(Student.class, studentId);
    }

    /**
     * Retrieves all student records from the database.
     * @return - Returns a list of all Student entities.
     */
    public List<Student> getAllStudents() {
        // Load all student entities from the database and return them as a list
        return this.hibernateTemplate.loadAll(Student.class);
    }
}
