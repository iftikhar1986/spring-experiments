package com.springorm.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_details")
public class Student {
	
	@Id
	@Column(name = "student_id")
	private int studentId;
	
	@Column(name = "student_name")
	private String studentName;
	
	@Column(name = "student_city")
	private String studentCity;

	// No-argument constructor
	public Student() {}

	// Parameterized constructor
	public Student(int studentId, String studentName, String studentCity) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCity = studentCity;
	}

	// Getters and Setters
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	// Override toString() for easy display
	@Override
	public String toString() {
		return "Student{" +
				"studentId=" + studentId +
				", studentName='" + studentName + '\'' +
				", studentCity='" + studentCity + '\'' +
				'}';
	}
}
