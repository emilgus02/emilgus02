package lektion;

import java.util.Scanner;

public class lektion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// villkor

		boolean again = true;
		int svar = 1;
		int age = 0; // initierat variabel

		Scanner input = new Scanner(System.in); // g�re det m�jligt att f� input fr�n konsekvens

		System.out.println("Hur gammal �r du");
		age = input.nextInt();

		if (age >= 18) { // (Villkor) dvs man j�mf�r i detta fall tv� heltal

			System.out.println("Du �r gammal nog att k�ta bil! Grattis ditt �ckel");
			System.out.println("Bara s� du vet f�r du �ka moppe ocks�");

		} else if (age >= 15 && age < 18) {

			System.out.println("Du �r f�r ung f�r att k�ra bil men du f�r k�ra moppe");
		}

		else { // om villkoret inte uppfylls k�rs else

			System.out.println("Tyv�rr du f�r v�nta ett tag till");

		}
	}
}
