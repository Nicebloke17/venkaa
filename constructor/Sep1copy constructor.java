package com.venkat;
						//copy constructor



class car {
	public String color;
	public String model;
	public String brand;
	public int price;
	
	
	public car (String color, String model, String brand , int price) {
		this.color = color;
		this.model = model;
		this.brand = brand ;
		this.price = price;
		
	}
	
	
	public car(car Audi) {
		this.color = Audi.color;
		this.model = Audi.model;
		this.brand = Audi.brand ;
		this.price = Audi.price;
		
		
	}
public void get() {
		
		System.out.println("car : this.color = " + color  + " this.model = " + model + " this.brand = " + brand + " this.price = " + price);
		
		
	}
}


public class Sep1constructor {
	public static void main(String[] args) {
		car c1 = new  car("black", "ns", "pulsar", 1500000);
		//c1.get();
		car c2 = new car(c1);
		c2.get();
	}

}
