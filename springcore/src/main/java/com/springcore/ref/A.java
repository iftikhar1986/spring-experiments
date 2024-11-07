package com.springcore.ref;

public class A {

    // Private variables for 'x' and 'obj' (an instance of class B)
    private int x;
    private B obj;

    // Default constructor
    public A() {
    	super();
    }
    

    // Getter method for 'x'
    public int getX() {
        return x;
    }

    // Setter method for 'x'
    public void setX(int x) {
        this.x = x;
    }

    // Getter method for 'obj'
    public B getObj() {
        return obj;
    }

    // Setter method for 'obj'
    public void setObj(B obj) {
        this.obj = obj;
    }

    // toString method to print the object's details
    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                ", obj=" + obj +
                '}';
    }
}
