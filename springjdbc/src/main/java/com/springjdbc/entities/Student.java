package com.springjdbc.entities;

public class Student {

    private int id;
    private String name;
    private String city;

    // Default constructor
    public Student() {}

    // Parameterized constructor
    public Student(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for city
    public String getCity() {
        return city;
    }

    // Setter for city
    public void setCity(String city) {
        this.city = city;
    }

    // Override toString() for easy display
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
