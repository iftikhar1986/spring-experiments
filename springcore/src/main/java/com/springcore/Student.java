// Define the package name where this class is located
package com.springcore;

/**
 * Represents a simple POJO class for a Student entity.
 * A POJO class typically has private fields, public getters and setters,
 * and possibly a constructor. It does not implement or extend specific
 * frameworks or libraries, making it a Plain Old Java Object.
 */
public class Student {
	
    // Field for storing the student's ID (unique identifier)
	private int studentId;
	
    // Field for storing the student's name
	private String studentName;
	
    // Field for storing the student's address
	private String studentAddress;
	
	
	/**
     * Default constructor for the Student class.
     * Used when no parameters are provided.
     */
    public Student() {
    	
    	super();
    }
	
	 /**
     * Parameterized constructor for creating a Student instance with all fields.
     * @param studentId The student's unique identifier
     * @param studentName The student's name
     * @param studentAddress The student's address
     */
    public Student(int studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }
	
	
	 // Getter method for studentId
    public int getStudentId() {
        return studentId;
    }

    // Setter method for studentId
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    // Getter method for studentName
    public String getStudentName() {
        return studentName;
    }

    // Setter method for studentName
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // Getter method for studentAddress
    public String getStudentAddress() {
        return studentAddress;
    }

    // Setter method for studentAddress
    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }
	
    /**
     * Overridden toString method to provide a string representation of the Student object.
     * @return A string containing the student's ID, name, and address
     */
    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress + "]";
    }
	
	
	

}
