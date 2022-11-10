package com.venkat;
														//abstract

abstract class Bike {
	public String color;
	public String model;
	public String brand;
	public int price;
	public abstract void get();
}

class Ns extends Bike{
	public Ns(String color, String model, String brand , int price ) {
		this.color = color;
		this.model = model;
		this.brand = brand ;
		this.price = price;
	}

	@Override
	public void get() {
		
		System.out.println("this.color = " + color  + "this.model = " + model + " this.brand = " + brand + "this.price = " + price);
		
		
	}
	
}

public class Sep1 {
public static void main(String[] args) {
	
	Ns  n = new Ns("black", "ns", "pulsar", 150000);
	n.get();
		
		
	
	
	
}

}
