package V43;

import java.util.Scanner;

public class metoder {

	public static void main(String[] args) {

		twonumber();
	}
	/**
	 * Skriver tv� heltal och skickar dom vidare 
	 */

	public static void twonumber() {

		int tal1;
		int tal2;

		Scanner input = new Scanner(System.in);

		System.out.println("V�nligen skriv in tv� tal, med ett enter emellan");

		tal1 = input.nextInt();
		tal2 = input.nextInt();

		System.out.println(minstaTal(tal1, tal2));
	}

	/**
	 * J�mf�r tv� heltal och utv�rderar vilket som �r minst. Samt skickar tillbaka
	 * en h�lsning.
	 * 
	 * @param tal1 heltal1
	 * @param tal2 heltal2
	 * @return String hej
	 */
	public static String minstaTal(int tal1, int tal2) {

		if (tal1 <= tal2) {
			System.out.println("Minsta talet �r: " + tal1);
		} else {
			System.out.println("Minsta talet �r: " + tal2);
		}

		String hej = "Programmet �r f�rdigt";

		return hej;
	}
}
