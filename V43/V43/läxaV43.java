package V43;

import java.util.Scanner;

public class l�xaV43 {

	public static void main(String[] args) {

		lol();

		int a;
		int b;

		Scanner input = new Scanner(System.in);

		a = input.nextInt();
		b = input.nextInt();

		System.out.println(max(a, b));
		
		int n;
		
		n = input.nextInt();
		
		count(n);
	}
/**
 * Skriver ut HAHAHAHAHAHAHA
 */
	public static void lol() {
		System.out.println("HAHAHAHAHAHAHAHA");

	}
/**
 * Jag tar reda p� vilket som �r st�rst sen s� skickar jag tillbaks det till main metoden som skriver ut det
 * @param a
 * @param b
 * @return
 */
	public static int max(int a, int b) {
		
		System.out.println("Skriv tv� heltal");

		if (a >= b) {

			return  a;
		} else {
			return  b;
		}
	}

	public static int count(int n) { //om n �r 5 skriv ut alla tal mellan 5 och  -4
		
		for(int i = 0; i > 0; i++);
	}
}
		
	
