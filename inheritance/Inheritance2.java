package com.venkat;

class animal{																		//single inheritance
	public void eat(){
		System.out.println("eating");
	}
}

class dog extends animal{
	public void bark() {
		System.out.println("barking");
	}
}

class cat extends animal{
	public void meow () {
		System.out.println("meowing");
	}


public class Inheritance2 {
public static void main(String[] args) {
	
	cat c = new cat();
	c.eat();
	c.meow();

	

}
}
}
