package com.venkat;
																		//constructor demo1
class Book{
	public String author;
	public String title;
	public int price;
	
	
	public Book(String author, String title, int price) {
	System.out.println("1st constructor");
		
		
		
		this.author=author;
		this.price=price;
		this.title=title;
			
	}
	
	public void get () {
		System.out.println("this.author =" + author + "  this.price = " + price + "  this.title = " + title);
	}
	
}


public class Sep2 {
	public static void main(String[] args) {
		
		Book b1 = new Book("aa", "bb", 20);
		b1.get();
		
		
	}

}
