package Uppgifter;

import java.util.Scanner;

public class N3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = 0;
		int i = 0;
		int y = 0;
		
		System.out.println("Skriv ut heltal. Skriv 0 för att avsluta");
		
		do {
			x = input.nextInt();
			y += x;
			if (x > 0) {
				i++;
			}
			
			if (x == 0) {
				System.out.println("Medelvärdet: " + y/i);
				System.out.println("Summa: " + y);
				break;
			}
		}
		while (x > 0);
		
		
		
		
				

	}

}
