package com.venkat;


class Book{
	public String title;
	public String author;
	public String quotes;
	
	public void get() {
		System.out.println("Book : title =  " + this.title + " author  = " + this.author + " quotes = " + this.quotes);
	}
	
}

class Harrypotter extends Book {
	public int priceforpermonth;
	
	public void out() {
		System.out.println("pricepermonth = " + this.priceforpermonth);
	}
	
}

class alice extends Book {
	public int price;
}

public class Sep6 {
	public static void main(String[] args) {
		
	Harrypotter hp = new Harrypotter();
	hp.author = "xcv";
	hp.quotes = "mnb";
	hp.title = "abc";
    hp.priceforpermonth = 500;
	hp.get();	
	hp.out();
	}

}
