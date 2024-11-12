package com.springjdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

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
		
		 // Update an existing student record
        String sql = "UPDATE student SET name = ?, city = ? WHERE id = ?";
        int result = jdbcTemplate.update(sql, student.getName(), student.getCity(), student.getId());
		return result;
	}

	public int delete(int id) {
		
		 // Delete a student record by id
        String sql = "DELETE FROM student WHERE id = ?";
        int result = jdbcTemplate.update(sql, id);
		return result;
	}

	public Student getStudent(int id) { 
		
		  // Get a student by id
        String sql = "SELECT * FROM student WHERE id = ?";
        RowMapper<Student> rowMapper =  new RowMapperImpl();
        
        Student result = jdbcTemplate.queryForObject(sql, rowMapper, id);
		return result;
	}

	public List<Student> getAllStudents() {
		// Get all students
        String sql = "SELECT * FROM student";
        List<Student> result = jdbcTemplate.query(sql, new RowMapperImpl());
        
        return result;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


    }

