package com.springcore.javaconfig;

public class Student {
    private String name = "Syed Iftikhar";
    private String city = "Doha, Qatar";
    private Samosa samosa;

    // Parameterized constructor
    public Student(Samosa samosa) {
       
        this.samosa = samosa;
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

    // Getter for samosa
    public Samosa getSamosa() {
        return samosa;
    }

    // Setter for samosa
    public void setSamosa(Samosa samosa) {
        this.samosa = samosa;
    }

    // Override toString() for easy display
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", samosa=" + samosa +
                '}';
    }
}
 