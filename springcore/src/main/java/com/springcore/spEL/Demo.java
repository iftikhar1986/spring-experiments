package com.springcore.spEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

    @Value("#{22}")  // Using SpEL to set a fixed value
    private int x;

    @Value("#{18 + 7}")  // Using SpEL to calculate and set the value
    private int y;

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

    // Optional: Override toString for easy display
    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
