package busreservation;

import java.util.ArrayList;
import java.util.Scanner;

public class Busdemo {
	public static void main(String[] args) {
		
		ArrayList<Bus>buses = new ArrayList<>();
		buses.add(new Bus(1,true,56));
		buses.add(new Bus (2,true,54));
		buses.add(new Bus (3,true, 55));
		
		int useroption = 5;
		
	Scanner scanner = new Scanner (System.in);
		
		for(Bus b : buses) {
			b.display();
	}
		
		
	}

}
