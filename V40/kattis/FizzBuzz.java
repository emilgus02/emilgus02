package kattis;

import java.util.Scanner;

public class FizzBuzz {
	

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	int tal1 = input.nextInt();
	int tal2 = input.nextInt();
	int tal3 = input.nextInt();

	for (int i = 1; i <= tal3; i++) { // i b�rjar med ett och plussar med ett barje g�ng tills det i blir st�rre �n tal3
		
	    if (i % tal1 == 0 && i % tal2 == 0) { //kollar om i �r % tal1 och tal2 om det �r kommer det st� fizzbuzz
	        System.out.println("FizzBuzz");
	    }
	
	    else if (i % tal1 == 0) { //kollar om i �r % tal2 om det �r s� s�gs fizz
	        System.out.println("Fizz");
	    }
	
	    else if (i % tal2 == 0) { //kollar om i �r % tal2 om det �r s� s�gs buzz
	        System.out.println("Buzz");
	    }
	
	    else {
	        System.out.println(i); //om talet inte �r % tal1 eller tal2 s� skrivs talet ut
	    		}
			}
	    }
	}