package com.venkat;

class Animal {
																	//	class animal
public	String name;
public String color;
public int biteforce;

}

public class aug30 {
	public static void main(String[] args) {
		Animal lion = new Animal();
		Animal tiger = new Animal();
		
		lion.name = "nnn";
		tiger.name= "mmm";
		lion.color = "yellow";
		tiger.color="orange";
		lion.biteforce=650;
		tiger.biteforce=1050;
		
		System.out.println(lion.color);
		System.out.println(lion.biteforce);
		System.out.println(tiger.biteforce);
	}
}