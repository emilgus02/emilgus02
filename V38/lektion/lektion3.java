package lektion;

import java.util.Scanner;

public class lektion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// villkor

		boolean again = true;
		int svar = 1;
		int age = 0; // initierat variabel

		Scanner input = new Scanner(System.in); // göre det möjligt att få input från konsekvens

		System.out.println("Hur gammal är du");
		age = input.nextInt();

		if (age >= 18) { // (Villkor) dvs man jämför i detta fall två heltal

			System.out.println("Du är gammal nog att köta bil! Grattis ditt äckel");
			System.out.println("Bara så du vet får du åka moppe också");

		} else if (age >= 15 && age < 18) {

			System.out.println("Du är för ung för att köra bil men du får köra moppe");
		}

		else { // om villkoret inte uppfylls körs else

			System.out.println("Tyvärr du får vänta ett tag till");

		}
	}
}
