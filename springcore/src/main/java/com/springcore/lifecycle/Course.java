package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Course {
    
    private String subject;

    // No-argument constructor
    public Course() {
    	super();
    }

    // Constructor with subject parameter
    public Course(String subject) {
        this.subject = subject;
    }

    // Getter for subject
    public String getSubject() {
        return subject;
    }

    // Setter for subject
    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Optional: Override toString() for easy display
    @Override
    public String toString() {
        return "Course{subject='" + subject + "'}";
    }
    
    @PostConstruct
    public void start() {
    	System.out.println("Starting Method");
    }
    
    
    @PreDestroy 
    public void end() {
    	System.out.println("Ending Method");
    }

}
