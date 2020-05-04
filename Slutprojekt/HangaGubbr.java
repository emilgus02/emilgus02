import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HangaGubbr {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean igen = true;
		String choice;

		do {

			System.out.println("V�lkommen till H�nga Gubbe");
			System.out.println("(1) L�tt 2-10 bokst�ver");
			System.out.println("(2) Medel 11-20 bokst�ver");
			System.out.println("(3) Sv�r 21-30 bokst�ver");
			System.out.println("(4) Regler");
			System.out.println("(5) Avsluta");
			System.out.println();

			choice = input.nextLine();

			difficulty(choice);

		} while (igen == true);

	}

	private static void difficulty(String choice) {
		if (choice.equals("1")) {
			ord();
		} else if (choice.equals("2")) {
			ord();
		} else if (choice.equals("3")) {
			ord();
		} else if (choice.equals("4")) {
			ord();
		} else if (choice.equals("5")) {
			System.exit(0);
		}

		else {

		}
	}

	private static void ord() {
		Scanner input = new Scanner(System.in);
		ArrayList<String> nameList = new ArrayList<String>();
		System.out.println("Du har nu valt sv�righetsgrad");
		System.out.println();
		System.out.println("Gissa nu en bokstav");
		nameList.add("Kamrat");
		nameList.add("Lektion");
		int slumpa = (int) (Math.random() * (2));
		StringBuffer ordet = new StringBuffer(nameList.get(slumpa).toUpperCase());
		guess(ordet);
	}

	private static void guess(StringBuffer ordet) {
		ArrayList<String> anv�nda = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		String repeated = null;
		StringBuffer Hemligt = new StringBuffer(repeated = new String(new char[(ordet.length())]).replace("\0", "_"));
		for (int k = 1; k < (ordet.length() + ordet.length()); k++) {
			Hemligt.insert(k, " ");
			k++;
		}

		for (int i = 0; i < 7;) {

				System.out.println();
				System.out.println(Hemligt);
				System.out.println();
				System.out.println("Skriv en bokstav");
				System.out.println();
				System.out.print("Du har anv�nt: ");
				for (int j = 0; j < anv�nda.size(); j++) {
					System.out.print(anv�nda.get(j) + ", ");
				}
				System.out.println();
				String Gissat = input.next().toUpperCase();
				char Gissning = Gissat.charAt(0);

				if (Gissat.equals(ordet.toString())) {
					Vann();
					i = 7;
				} else if (kolla(Gissning, anv�nda, Gissat) == true) {
					if (!(ordet.toString().contains(Gissat))) {
						gubben(i);
						i++;
					} else {
						for (int j = 0; j < ordet.length(); j++) {
							if (ordet.charAt(j) == Gissning) {
								for (int k = 1; k < Hemligt.length(); k++) {
									Hemligt.delete(k, k + 1);
								}
								Hemligt.replace(j, j + 1, String.valueOf(Gissning));
								if (ordet.toString().equals(Hemligt.toString()) == true) {
									Vann();
									i = 7;
								}
								for (int l = 1; l < ordet.length() * 2; l++) {
									Hemligt.insert(l, " ");
									l++;
								}
							}
						}
					}

				}
			
		}
		

	}

	private static void Vann() {
		System.out.println("Grattis du vann");
		again();

	}

	private static void gubben(int i) {
		if (i == 0) {
			System.out.println("Fel gissning, f�rs�k igen");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("___|___");
			System.out.println();
		}
		if (i == 1) {
			System.out.println("Fel gissning, f�rs�k igen");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (i == 2) {
			System.out.println("Fel gissning, f�rs�k igen");
			System.out.println("   ____________");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   | ");
			System.out.println("___|___");
		}
		if (i == 3) {
			System.out.println("Fel gissning, f�rs�k igen");
			System.out.println("   ____________");
			System.out.println("   |           |");
			System.out.println("   |           O");
			System.out.println("   |        		");
			System.out.println("   |         		");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (i == 4) {
			System.out.println("Fel gissning, f�rs�k igen");
			System.out.println("   ____________");
			System.out.println("   |          |");
			System.out.println("   |          O");
			System.out.println("   |          |");
			System.out.println("   |          |");
			System.out.println("   |           ");
			System.out.println("   |          ");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (i == 5) {
			System.out.println("Fel gissning, f�rs�k igen");
			System.out.println("   ____________");
			System.out.println("   |           |");
			System.out.println("   |           O");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |          / \\");
			System.out.println("   |         /   \\");
			System.out.println("   |           ");
			System.out.println("___|___         ");
		}
		if (i == 6) {
			System.out.println("Fel gissning, Game Over");
			System.out.println("   ____________");
			System.out.println("   |           |");
			System.out.println("   |           O");
			System.out.println("   |         --|--");
			System.out.println("   |           |");
			System.out.println("   |          / \\");
			System.out.println("   |         /   \\");
			System.out.println("   |           ");
			System.out.println("___|___         ");
			again();
		}
	}

	private static boolean kolla(char Gissning, ArrayList<String> anv�nda, String Gissat) {
		String kollar = String.valueOf(Gissning);
		if (Gissat.length() == 1) {
			for (int i = 0; i <= anv�nda.size();) {

				if (anv�nda.contains(kollar) == false) {

					if (Character.isLetter(kollar.charAt(i)) == true) {
						anv�nda.add(kollar);
						return true;
					} else {
						System.out.println("V�nligen skriv en bokstav");
						return false;
					}
				} else {
					System.out.println("V�nligen skriv inte en bokstav som du redan har innan");
					return false;
				}
			}
		} else {
			System.out.println("V�nligen skriv endast en bokstav");
			return false;
		}
		return false;
	}

	private static void again() {
		Scanner input = new Scanner(System.in);
		boolean igen = true;
		System.out.println("Vill du spela igen? Skriv 1 om du vill spela igen 0 om du inte");
		do {
			String again = input.nextLine();
			if (again.equals("1")) { // Kollar om man har skrivit 1
				igen = false; // st�nger av den h�r loopen
			} else if (again.equals("0")) { // Kollar om man har skrivit 2
				System.exit(0); // St�nger av programmet
			} else { // Om man har varken skrivit 1 eller 0
				System.out.println("Sn�lla v�lj 1 eller 0");
			}
		} while (igen == true);
	}
}