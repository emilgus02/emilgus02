package Uppgifter;

import java.util.Scanner;

public class N4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int a = 100000;
		int sum = 1;
		int x = 0;
		
		for (int i = 0; sum <= a && i < 10; i++) {
			
			if (sum < a) {
				int heltal = input.nextInt();
				
				sum = heltal*sum;
				 
				x++;
			}
			
		}
		System.out.println("Total summa " + sum);
		System.out.println("Antal gånger det har multiplicerat " + x);

	}

}
