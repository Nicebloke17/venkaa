package com.venkat;

import java.util.Scanner;

public class Ifelse {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	int age = sc.nextInt();
	
	if(age>= 50) {
		System.out.println("go to home");
	}
	
	else if(age<=40){
		System.out.println("go to office");
	}
	else {
		System.out.println("go to ground");
	}
}

}
