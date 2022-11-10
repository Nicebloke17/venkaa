package com.venkat;

//import com.venkat.Employee.Fulltimeemployee;

class Employee{
	public int employeeid;
	public String name;
	public String email;
	
	//public Employee(int employeeid, String name, String email) {
		//this.employeeid = employeeid;
	//	this.email = email;
		//this .name = name;
	//}
	
	
	public void get() {
		System.out.println(" employeeid = " + employeeid + " name = " + name + " email = " + email );
	}
}
	
	class Fulltimeemployee extends Employee{
		public int monthlysalery;
		
		
		
		public Fulltimeemployee(int employeeid, String name, String email, int monthylysalery) {
			
			System.out.println("Fulltimeemployee.....");
			
			this.employeeid = employeeid;
				this.email = email;
				this .name = name;
				this.monthlysalery= monthlysalery;
		}
	}
		
/*	public void out() {
		System.out.println(" monthlysalery = " + monthlysalery);
}*/
		
	
	
	class Parttimeemployee extends Employee{
		public int hoursalery;
	}


public class Inheritancedemo1 {
	public static void main(String[] args) {
		 Fulltimeemployee fte = new Fulltimeemployee(112345, "henry","vvv@gmail.com", 900000);
		// fte.email = "vvv@gmail.com";
	//	 fte.employeeid = 112345;
	//	 fte.name = "henry";
	//	 fte.monthlysalery= 700000;
        fte.get();
	//	 fte.out();
			
		
		}

}
