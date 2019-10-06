package kattis;

import java.util.Scanner;

public class oddities {

	public static void main(String[] args) {
		
		System.out.println("Skriv ett mellan -10 och 10");
		
		Scanner input = new Scanner (System.in);
		
		int tal1 = input.nextInt();
		
		while (tal1 -- > 0) {
	            
	            System.out.println(tal1 % 2 == 0 ? tal1 + " is even" : tal1 + " is odd");
	        }
	        input.close();
		
		
		

	}

}
