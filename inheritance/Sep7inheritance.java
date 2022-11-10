package com.venkat;
													//inheritance using super keyword
													// has a 
class myself{
	public String name;
	
	public myself(String name) {
		System.out.println("venkat" + name);
	// 	this.name= name;

	}
	
}

class she extends myself
{
	public she(String name) {
		super(name);
		System.out.println("haridhaamaadu");
	}
public void get() {
	// System.out.println("this.name = " + name);
}
	
}

public class Sep7inheritance {
public static void main(String[] args) {
	she s = new she("mass");
	s.get();
}
}
