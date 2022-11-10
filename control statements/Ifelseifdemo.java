package com.venkat;

public class Ifelseifdemo {
public static void main(String[] args) {
	int mark = 88;
	if(mark<35) {
		System.out.println("fail");
	}
	else if (mark>=50&&mark<=70) {
		System.out.println("c grade");
	}
	else if (mark>=70&&mark<=80) {
		System.out.println("b grade");
	}
	else {
		System.out.println("a grade");
	}
}
}
