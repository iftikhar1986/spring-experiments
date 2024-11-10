package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean 
	public Samosa getSamosa() {
		return new Samosa(); 
	}

    @Bean
    public Student getStudent() {
        // Instantiate and return a Student object
        Student student = new Student(getSamosa());
        return student;
    }
}
