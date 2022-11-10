package com.venkat;
															//constructor using super keyword
class vehicle{
	public vehicle(String bike) {
		System.out.println("vehicle = " + " bike");
	}
}

class car extends vehicle{
	public car (String audi) {
		super(audi);
		System.out.println("car");
	}
}






public class Sep5constructor {
	public static void main(String[] args) {
		//vehicle v = new vehicle();
		car c = new car("pulsar");
	}

}
