package com.venkat;

import java.util.Scanner;

// odd number using for loop
public class Oddnumber {
public static void main(String[] args) {
/*	int a = 100;
	int i;
	for(i=1;i<=a;i++) {
		if(i%2!=0) {
			System.out.println(i);
		}
	}*/
	
// odd number using while loop	
	int a ;
	int i=1;
	Scanner sc = new Scanner(System.in);
	a = sc.nextInt();
	
	while(i<=a) {
		System.out.println(i);
		i =i+2;
	}
}
}

