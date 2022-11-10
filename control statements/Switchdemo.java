package com.venkat;

public class Switchdemo {
public static void main(String[] args) {
	int month = 9;
	String monthname = "" ;
	
	switch(month) {
	
case 1 : monthname =" 1 - jan";
//break;
	
case 2 : monthname =" 2 - feb";
//break;

case 3 : monthname =" 3 - mar";
break;

case 4 : monthname =" 4  - apr";
break;

case 5 : monthname =" 5 - may";
break;

case 6 : monthname ="6 - jun";
break;

case 7 : monthname =" 7 - jul";
break;

case 8 : monthname =" 8 - aug";
break;


case 9 : monthname =" 9 - sep";
//break;

default : System.out.println("invalid month");
    

}
	
	System.out.println(monthname);
	
}

}
