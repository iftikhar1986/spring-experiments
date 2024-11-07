package com.springcore.ref;

public class B {

    // Private variable for the 'y' property
    private int y;

    // Default constructor
    public B() {
    	super();
    }

    // Getter method for 'y'
    public int getY() {
        return y;
    }

    // Setter method for 'y'
    public void setY(int y) {
        this.y = y;
    }

    // toString method to print the object's details
    @Override
    public String toString() {
        return "B{" +
                "y=" + y +
                '}';
    }
}
