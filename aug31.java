package com.venkat;
																//abstract

 abstract class shape {
	public double height;
	public double width;
	public double radius;
	public float pie = 3.14f;
abstract public  void getarea() ;
	
 }
class rectangle extends shape {
	public rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	public void draw() {
		System.out.println("drawing a rectangle");
		
	}

	@Override
	public void getarea() {
		System.out.println("area of rectangle = " +(height*width));
		
	}

}
class circle extends shape{
	public circle (double radius) {
		this.radius= radius;
	}

	@Override
	public void getarea() {
		System.out.println("area of circle= " +(3.14*radius*radius));
		
	}

}



public class aug31 {
public static void main(String[] args) {
	rectangle r = new rectangle(76, 89);
	circle c = new circle(6);
	r.draw();
	r.getarea();
	c.getarea();
	
}
}

 
