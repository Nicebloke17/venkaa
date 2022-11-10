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

class cat extends dog{													//multilevel
	public void feed () {
		System.out.println("feeding");
	}
													

public class Inheritance {
public static void main(String[] args) {
	dog d = new dog();
	cat c = new cat();
	d.bark();
	d.eat();
	c.feed();

}
}
}
