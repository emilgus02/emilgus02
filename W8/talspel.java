import java.util.Scanner;

public class talspel {

	/**
	 * �r menyn d�r spelaren f�r v�lja sv�righetsgrad i spelet
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean igen = true;
		String choice;

		while (igen == true) {
			System.out.println("V�lkommen till Guess The Number");
			System.out.println("H�r kan du v�lja svighetsgrad p� spelet");
			System.out.println("(1) L�tt: 15 Gissningar");
			System.out.println("(2) Medel: 10 Gissningar");
			System.out.println("(3) Sv�r: 5 Gissningar");
			System.out.println("(4) Master: 1 Gissning");
			System.out.println("(5) Avsluta");
			System.out.println();

			choice = input.nextLine();

			if (choice.equals("1")) { // Kollar om man har skrivit 1
				int antal = 15; // v�ljer hur m�nga antal gissningar man har
				guess(igen, antal); // Kallar metoden guess
			} else if (choice.equals("2")) {
				int antal = 10;
				guess(igen, antal);
			} else if (choice.equals("3")) {
				int antal = 5;
				guess(igen, antal);
			} else if (choice.equals("4")) {
				master(igen);
			} else if (choice.equals("5")) {
				System.exit(0); // St�nger av programmet
			} else { // Om man inte skrivit ett tal mellan 1-5
				System.out.println("Sn�lla skriv ett tal mellan 1 och 4 tack");
			}
		}
	}

	/**
	 * H�r g�r man ocks� en gissning bara att det �r en annan sv�rhetes grad s� man
	 * f�r bara en chans p� sig
	 * 
	 * @param igen
	 * @return
	 */
	private static boolean master(boolean igen) {
		System.out.println("Du valde Master");
		System.out.println("Gissa nu ett tal mellan 1-100");
		Scanner input = new Scanner(System.in);
		int talet = 0;
		boolean car = true;
		int slump = (int) (Math.random() * (100) + 1);
		do {
			String spel = input.nextLine();
			if (nummer(spel) == true) {
				talet = Integer.parseInt(spel);
				if (talet > 0 && talet < 101) {
					if (talet == slump) { // Kollar om man har r�tt
						System.out.println("Du vann GRATTIS!!! du �r nu �r Master ");
						System.out.println("Vill du spela igen? Skriv 1 om du vill spela igen 0 om du inte");
						car = false;
					} else {
						System.out.println("Du har inga gissningar kvar, talet var " + slump);
						System.out.println("Vill du spela igen? Skriv 1 om du vill spela igen 0 om du inte");
						car = false;
					}
				} else {
					System.out.println("V�lj g�rna ett heltal mellan 1-100");
				}
			} else {
				System.out.println("V�lj g�rna ett heltal mellan 1-100");
			}
		} while (car == true);

		igen1(igen); // Man hamnar i metoden igen1 f�r att kolla om man vill k�ra igen

		return igen; // Returnar igen om man vill k�ra igen
	}

	/**
	 * H�r g�r man sj�lva gissningen s� kollar den om talet �r h�gre eller l�gre en
	 * det talet som man har skrivit
	 * 
	 * @param igen
	 * @param antal
	 * @return
	 */
	private static boolean guess(boolean igen, int antal) {
		System.out.println("Du har nu valt en sv�righetsgrad");
		System.out.println("Gissa nu ett tal mellan 1-100");
		Scanner input = new Scanner(System.in);
		int talet = 0;
		int slump = (int) (Math.random() * (100) + 1); // Det h�r slumpar talet man ska gissa

		for (int i = 0; i <= antal; i++) { // for loopen �r f�r att kolla hur m�nga chanser man har p� sig
			int k = antal - i; // �r f�r att visa hur m�nga chanser man har kvar
			if (i == antal) { // H�r hamnar man om man inte har n�gra gissningar kvar
				System.out.println("Du har inga gissningar kvar, talet var " + slump);
				System.out.println("Vill du spela igen? Skriv 1 om du vill spela igen 0 om du inte");
				igen1(igen); // man hamnar i metoden igen1 f�r att kolla om man vill k�ra igen
			} else {
				System.out.println("Du har " + k + " gissningar kvar");
				String spel = input.nextLine(); // H�r g�r man gissningen om man vilket tal man tror att det �r
				if (nummer(spel) == true) { // Man hamnar i metoden nummer f�r att kolla att det �r endast ett heltal i
											// och inte n�gon bokstav
					talet = Integer.parseInt(spel); // Detta g�r om Stringen till en int

					if (talet == slump) { // Om man har gissat r�tt s� hammnar man h�r f�r att ber�tta att man har
											// vunnit
						int L = k - 1; // F�r att visa hur m�nga f�rs�k man hade kvar n�r man klara det
						System.out.println("Du vann GRATTIS!!! du hade " + L + " f�rs�k kvar");
						System.out.println("Vill du spela igen? Skriv 1 om du vill spela igen 0 om du inte");
						igen1(igen);
						i = antal; // F�r att stoppa loopen
					} else { // Om man inte gissar r�tt
						if (talet > 0 && talet < 101) {// Om talet �r inte mellan 1-100 s� k�rs inte denna loop
							if (slump > talet) { // Om talet �r st�rre �n r�tt svar
								System.out.println("Talet �r st�rre �n ditt tal");
							} else if (slump < talet) { // Om talet �r mindre �r r�tt tal
								System.out.println("Talet �r mindre �n ditt tal");
							}
						} else {
							i--; // F�r att man ska f� en till chans om man har gissat ett tal som inte �r mellan
									// 1-100
							System.out.println("V�lj ett tal mellan 1-100");
						}
					}
				} else {
					System.out.println("V�lj g�rna ett heltal mellan 1-100");
					i--; // F�r att man ska f� en till chans om man har gissat med en bokstav
				}
			}

		}
		return igen; // Returnar igen om man vill k�ra igen
	}

	/**
	 * Kollar om spel �r ett heltal utan n�gon bokstav
	 * 
	 * @param spel
	 * @return
	 */
	private static boolean nummer(String spel) {
		int length = spel.length(); // Skapar en inte som �r l�ngden p� Stringen spel som sedan anv�nds i for loopen
		if (spel.isEmpty()) { // Kollar om man ar skrivit n�got i spel
			return false;
		}
		for (int i = 0; i < length; i++) {
			if (Character.isDigit(spel.charAt(i)) == false) { // isDigit kollar om det bara i siffror i spel
				return false;
			}
		}
		return true;
	}

	/**
	 * Kollar om man vill k�ra spelet igen
	 * 
	 * @param igen
	 * @return
	 */
	private static boolean igen1(boolean igen) {
		Scanner input = new Scanner(System.in);
		boolean boll = true;
		do {
			String again = input.nextLine();
			if (again.equals("1")) { // Kollar om man har skrivit 1
				igen = true; // s�ger att man vill k�ra igen
				boll = false; // st�nger av den h�r loopen
			} else if (again.equals("0")) { // Kollar om man har skrivit 2
				System.exit(0); // St�nger av programmet
			} else { // Om man har varken skrivit 1 eller 0
				System.out.println("Sn�lla v�lj 1 eller 0");
			}
		} while (boll == true);
		return igen; // Returnar igen f�r att man f�r att veta om man vill k�ra igen eller inte
	}

}
