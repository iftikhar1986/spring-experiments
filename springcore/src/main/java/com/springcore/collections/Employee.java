// Define the package where this class is located
package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Employee class represents an employee with properties for name,
 * phones, addresses, and courses. This class demonstrates the use
 * of various collection types in a POJO class.
 */
public class Employee {

    // Field for storing the employee's name
    private String name;

    // Field for storing a list of employee phone numbers
    private List<String> phones;

    // Field for storing a set of employee addresses (unique values)
    private Set<String> address;

    // Field for storing a map of courses and their descriptions
    private Map<String, String> courses;

    /**
     * Default constructor for Employee class.
     * Initializes an empty Employee object with no data set.
     */
    public Employee() {
    	super();
    }

    /**
     * Parameterized constructor for Employee class.
     * @param name The employee's name
     * @param phones A list of phone numbers associated with the employee
     * @param address A set of addresses associated with the employee
     * @param courses A map of courses the employee has taken and their details
     */
    public Employee(String name, List<String> phones, Set<String> address, Map<String, String> courses) {
        this.name = name;
        this.phones = phones;
        this.address = address;
        this.courses = courses;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for phones
    public List<String> getPhones() {
        return phones;
    }

    // Setter method for phones
    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    // Getter method for address
    public Set<String> getAddress() {
        return address;
    }

    // Setter method for address
    public void setAddress(Set<String> address) {
        this.address = address;
    }

    // Getter method for courses
    public Map<String, String> getCourses() {
        return courses;
    }

    // Setter method for courses
    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    /**
     * Overridden toString method to provide a string representation of the Employee object.
     * @return A string containing the employee's name, phones, addresses, and courses
     */
    @Override
    public String toString() {
        return "Employee [name=" + name + ", phones=" + phones + ", address=" + address + ", courses=" + courses + "]";
    }
}
