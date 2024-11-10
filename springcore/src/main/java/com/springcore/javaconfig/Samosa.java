package com.springcore.javaconfig;

public class Samosa {
    private String flavor;
    private double price;

    // No-argument constructor
    public Samosa() {}

    // Parameterized constructor
    public Samosa(String flavor, double price) {
        this.flavor = flavor;
        this.price = price;
    }

    // Getter for flavor
    public String getFlavor() {
        return flavor;
    }

    // Setter for flavor
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Override toString() for easy display
    @Override
    public String toString() {
        return "Samosa{" +
                "flavor='" + flavor + '\'' +
                ", price=" + price +
                '}';
    }
}
