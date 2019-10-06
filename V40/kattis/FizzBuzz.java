package kattis;

import java.util.Scanner;

public class FizzBuzz {
	

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	int tal1 = input.nextInt();
	int tal2 = input.nextInt();
	int tal3 = input.nextInt();

	for (int i = 1; i <= tal3; i++) { // i börjar med ett och plussar med ett barje gång tills det i blir större än tal3
		
	    if (i % tal1 == 0 && i % tal2 == 0) { //kollar om i är % tal1 och tal2 om det är kommer det stå fizzbuzz
	        System.out.println("FizzBuzz");
	    }
	
	    else if (i % tal1 == 0) { //kollar om i är % tal2 om det är så sägs fizz
	        System.out.println("Fizz");
	    }
	
	    else if (i % tal2 == 0) { //kollar om i är % tal2 om det är så sägs buzz
	        System.out.println("Buzz");
	    }
	
	    else {
	        System.out.println(i); //om talet inte är % tal1 eller tal2 så skrivs talet ut
	    		}
			}
	    }
	}