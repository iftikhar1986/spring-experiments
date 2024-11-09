package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
    
	@Autowired
	@Qualifier("address1")
    private Address address;

    // No-argument constructor
    public Employee() {
    	super();
    }

    // Constructor with Address parameter
    
    
    public Employee(Address address) {
        this.address = address;
    }

    // Getter for address
    public Address getAddress() {
        return address;
    }

    // Setter for address	
    
    public void setAddress(Address address) {
        this.address = address;
    }

    // Optional: Override toString() for easy display
    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
