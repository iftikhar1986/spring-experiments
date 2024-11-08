package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
    
    private double price;

    // No-argument constructor
    public Pepsi() {
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
//
//    // Initialization method
    public void init() {
        System.out.println("Pepsi bean is going through init. Price is set to: $" + price);
    }

   

    // Optional: Override toString() for easy display
    @Override
    public String toString() {
        return "Pepsi{price=" + price + "}";
    }

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
        System.out.println("Taking Pepsi from Shelf");

		
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		 System.out.println("Putting back Pepsi in Shelf");
		
	}
}
