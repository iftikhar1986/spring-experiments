package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
    
    private List<String> friends;
    private Map<String, Integer> feestructure;
    private Properties properties;

    // Getter for friends
    public List<String> getFriends() {
        return friends;
    }

    // Setter for friends
    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    // Getter for feestructure
    public Map<String, Integer> getFeestructure() {
        return feestructure;
    }

    // Setter for feestructure
    public void setFeestructure(Map<String, Integer> feestructure) {
        this.feestructure = feestructure;
    }

    // Getter for properties
    public Properties getProperties() {
        return properties;
    }

    // Setter for properties
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    // Override toString for easy display of all fields
    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                ", feestructure=" + feestructure +
                ", properties=" + properties +
                '}';
    }
}
