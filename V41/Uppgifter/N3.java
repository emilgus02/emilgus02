package Uppgifter;

import java.util.Scanner;

public class N3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = 0;
		int i = 0;
		int y = 0;
		
		System.out.println("Skriv ut heltal. Skriv 0 f�r att avsluta");
		
		do {
			x = input.nextInt();
			y += x;
			if (x > 0) {
				i++;
			}
			
			if (x == 0) {
				System.out.println("Medelv�rdet: " + y/i);
				System.out.println("Summa: " + y);
				break;
			}
		}
		while (x > 0);
		
		
		
		
				

	}

}
