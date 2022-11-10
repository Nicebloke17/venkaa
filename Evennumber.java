package com.venkat;

import java.util.Scanner;

//even number
public class Evennumber {

	public static void main(String[] args) {
		
/*		int  i ;
		
	for (i=1;i<=i;i++) {
		if(i%2==0) {
			System.out.println(i);
		}
	}*/
		
		int v;
		int k = 2;
		
		Scanner scanner = new Scanner(System.in);
		v = scanner.nextInt();
		
		while(k<=v) {
			System.out.println(k);
			k = k+2;
		}
		
		
	}
}
