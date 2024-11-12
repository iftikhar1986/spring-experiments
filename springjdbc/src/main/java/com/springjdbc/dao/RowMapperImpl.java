package com.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.springjdbc.entities.Student;

public class RowMapperImpl implements RowMapper<Student> {

    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        // Create a new Student object
        Student student = new Student();
        
        // Map the columns from ResultSet to the fields in Student
        student.setId(rs.getInt(1));
        student.setName(rs.getString(2));
        student.setCity(rs.getString(3));
        
        // Return the populated Student object
        return student;
    }
}
