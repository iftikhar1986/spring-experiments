package com.springcore.lifecycle;

public class TriangularPastry {
	
	private double price;

	// No-argument constructor
	public TriangularPastry() {
		super();
	}

	// Getter for price
	public double getPrice() {
		return price;
	}

	// Setter for price
	public void setPrice(double price) {
		this.price = price;
	}

	// Optional: Override toString() for easy display
	@Override
	public String toString() {
		return "TriangularPastry{price=" + price + "}";
	}
	
	 // Initialization method
    public void hi() {
        System.out.println("TriangularPastry bean is going through init. Price is set to: $" + price);
    }

    // Destruction method
    public void bye() {
        System.out.println("TriangularPastry bean will be destroyed now.");
    }

}
