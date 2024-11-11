package com.springjdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {

	
    private JdbcTemplate jdbcTemplate;

    
   
    public int insert(Student student) {
        // Insert a new student record into the student table
        String sql = "INSERT INTO student (id, name, city) VALUES (?, ?, ?)";
        int result = jdbcTemplate.update(sql, student.getId(), student.getName(), student.getCity());
        return result;
    }
	public int update(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


    }
