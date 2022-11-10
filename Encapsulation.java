package com.venkat;


	class Doctor{
	    
	    private int count;
	    private String Tablet_name;
	    
	    public int setCount(int count)
	    {
	        this.count = count;
	        System.out.println("No of tablets : "+this.count);
			return count;
	    }
	    public int getCount()
	    {
	        return count;
	    }
	    
	    public String setName(String Tablet_name)
	    {
	        this.Tablet_name = Tablet_name;
	        System.out.println("The name ofthe tablet is "+this.Tablet_name);
		return Tabletname;

	    }

	    public String getName()
	    {
	        return Tablet_name;
	    }
	}
	public class Encapsulation {
		public static void main(String[] args) {
	    {
	        Doctor obj = new Doctor();
	        obj.setCount(3);
	        obj.setName("Dolo 650");
	    }
	}
}

