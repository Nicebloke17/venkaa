package com.venkat;

																//constructor demo2

class calculator{
	int a = 29;
	int b = 39;
	
	public calculator () {
		System.out.println("parameterless constructor");
		
	}
	
	public calculator(int a , int b ) {
		System.out.println("parameterized constructor");
	
	this.a = a;
	this.b = b;
	
	}
	public void get () {
		System.out.println("sum = " + (a+b));
	}
	
}


public class Sep2constructordemo2 {
public static void main(String[] args) {

	calculator cl = new calculator();
	cl.get();
	
	calculator c2 = new calculator(30, 56);
	c2.get();

}
}

