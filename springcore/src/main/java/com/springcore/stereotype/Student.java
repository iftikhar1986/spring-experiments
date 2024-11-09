package com.springcore.stereotype;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("Syed Iftikhar")
    private String name;
    
    @Value("Doha, Qatar")
    private String city;
    
    @Value("#{addressList}")  // Injecting the list using Spring Expression Language (SpEL)
    private List<String> address;

    // No-argument constructor
    public Student() {}

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

    // Getter for address
    public List<String> getAddress() {
        return address;
    }

    // Setter for address
    public void setAddress(List<String> address) {
        this.address = address;
    }

    // Optional: Override toString() for easy display
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", address=" + address +
                '}';
    }
}
