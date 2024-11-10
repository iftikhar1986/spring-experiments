package com.springcore.spEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

    @Value("#{22}")  // Using SpEL to set a fixed value
    private int x;

    @Value("#{18 + 7}")  // Using SpEL to calculate and set the value
    private int y;

    @Value("#{T(java.lang.Math).sqrt(25)}")  // Using SpEL to calculate z as the square root of 25
    private double z;

    @Value("#{T(java.lang.Math).E}")  // Using SpEL to set e to Euler's number
    private double e;

    @Value("#{ new java.lang.String('Syed Iftikhar')}")  // Setting a fixed string value using SpEL
    private String name;

    @Value("#{true}")  // Using SpEL to set a fixed boolean value for isActive
    private boolean isActive;

    // No-argument constructor
    public Demo() {}

    // Getter for x
    public int getX() {
        return x;
    }

    // Setter for x
    public void setX(int x) {
        this.x = x;
    }

    // Getter for y
    public int getY() {
        return y;
    }

    // Setter for y
    public void setY(int y) {
        this.y = y;
    }

    // Getter for z
    public double getZ() {
        return z;
    }

    // Setter for z
    public void setZ(double z) {
        this.z = z;
    }

    // Getter for e
    public double getE() {
        return e;
    }

    // Setter for e
    public void setE(double e) {
        this.e = e;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for isActive
    public boolean isActive() {
        return isActive;
    }

    // Setter for isActive
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    // Override toString for easy display
    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", e=" + e +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
