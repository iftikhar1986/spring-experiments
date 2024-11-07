package com.springcore.ci;

public class Person {

    private String name;
    private int personid;
    private Certificate certificate;

    // Constructor with parameters for dependency injection
    public Person(String name, int personid, Certificate certificate) {
        this.name = name;
        this.personid = personid;
        this.certificate = certificate;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', personid=" + personid + ", certi=" + certificate + '}';
    }
}
