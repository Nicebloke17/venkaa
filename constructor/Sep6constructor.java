package com.venkat;

class tables{
	int a;
	int b ;
	
	public tables() {
		System.out.println("parameterless constructor");
	}
	
	public tables(int a , int b) {
		this.a = a;
		this.b = b;
	}
	void get() {
		System.out.println(a+b);
	}
}
public class Sep6constructor {
public static void main(String[] args) {
	
	tables t = new tables(7, 9);
	
	t.get();
	
}
}
