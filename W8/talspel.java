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

		do {
			System.out.println("V�lkommen till Guess The Number");
			System.out.println("H�r kan du v�lja svighetsgrad p� spelet");
			System.out.println("(1) L�tt: 15 Gissningar");
			System.out.println("(2) Medel: 10 Gissningar");
			System.out.println("(3) Sv�r: 5 Gissningar");
			System.out.println("(4) Eget: V�lj egna intervall");
			System.out.println("(5) Avsluta");
			System.out.println();

			choice = input.nextLine();

			difficulty(choice, igen);
		} while (igen == true);
	}

	/**
	 * V�ljer sv�righetsgrad
	 * 
	 * @param choice
	 * @param igen
	 */
	private static void difficulty(String choice, boolean igen) {
		Scanner input = new Scanner(System.in);
		if (choice.equals("1")) { // Kollar om man har skrivit 1
			int antal = 15;// v�ljer hur m�nga antal gissningar man har
			int max = 100;
			guess(antal, max); // Kallar metoden guess
		} else if (choice.equals("2")) {
			int antal = 10;
			int max = 100;
			guess(antal, max);
		} else if (choice.equals("3")) {
			int antal = 5;
			int max = 100;
			guess(antal, max);
		} else if (choice.equals("4")) {
			int max = 0;
			int antal = 0;
			diff4(max, antal);

		} else if (choice.equals("5")) {
			System.exit(0); // St�nger av programmet
		} else { // Om man inte skrivit ett tal mellan 1-5
			System.out.println("Sn�lla skriv ett tal mellan 1 och 4 tack");
		}

	}
	
	/**
	 * V�ljer antalet och intervallerna i sv�righetsgrad 4
	 * @param max
	 * @param antal
	 */
	private static void diff4(int max, int antal) {
		Scanner input = new Scanner(System.in);
		String max1;
		boolean diff0 = false;
		boolean diff = false;
		boolean diff2 = false;
		do { // loopar om man skriver in 0
			diff0 = false;
			System.out.println("Hur m�nga gissningar vill du ha? (Skriv g�rna ett tal mellan 1 och 999999999)");
			do { // om man skriver en bokstav
				diff = false;
				max1 = input.nextLine();
				if (nummer2(max1) == true) { // Kollar om det �r ett heltal
					antal = Integer.parseInt(max1); // G�r om talet till en Int

				} else {
					System.out.println();
					System.out.println("Skriv g�rna ett heltal mellan 1 och 999999999");
					System.out.println("Hur m�nga gissningar vill du ha?");
					diff = true;
				}
			} while (diff == true);
			System.out
					.println("Vad ska st�rsta talet i intervallet vara? (Skriv g�rna ett tal mellan 1 och 999999999)");
			do { // Om man skriver en bokstav
				diff2 = false;
				max1 = input.nextLine();
				if (nummer2(max1) == true) {
					max = Integer.parseInt(max1); // G�r om max1 till int max
				} else {
					System.out.println();
					System.out.println("Skriv g�rna ett heltal mellan 1 och 999999999");
					System.out.println("Hur m�nga gissningar vill du ha?");
					diff2 = true;
				}
			} while (diff2 == true);
			if (max > 0 && antal > 0) { // Kollar s� talet inte �r under 1
				System.out.println();
				guess(antal, max);
			} else if (max == 0) {
				System.out.println("Du kan inte ha 0 som max i intervallet");
				diff0 = true;
			} else {
				System.out.println("Du kan inte ha 0 gissningar");
				diff0 = true;
			}
		} while (diff0 == true);

	}

	/**
	 * Kollar om talet �r ett heltal om det �r under 999999999
	 * 
	 * @param max1
	 * @return
	 */
	private static boolean nummer2(String max1) {
		int length = max1.length(); // Skapar en inte som �r l�ngden p� Stringen spel som sedan anv�nds i for loopen
		if (length > 9) { // Kollar s� talet �r inte st�rre �n 999 999 999. Anv�nds mer f�r att det inte
							// ska bli
							// error n�r man g�r �ver intens storlek
			return false;
		}
		if (max1.isEmpty()) { // Kollar om man ar skrivit n�got i max1
			return false;
		}
		for (int i = 0; i < length; i++) {
			if (Character.isDigit(max1.charAt(i)) == false) { // isDigit kollar om det bara i siffror i spel
				return false;
			}
		}
		return true;
	}

	/**
	 * H�r g�r man sj�lva gissningen s� kollar den om talet �r h�gre eller l�gre en
	 * det talet som man har skrivit
	 * 
	 * @param igen
	 * @param antal
	 * @return
	 */
	private static void guess(int antal, int max) {
		System.out.println("Du har nu valt en sv�righetsgrad");
		System.out.println("Gissa nu ett tal mellan " + 1 + "-" + max);
		Scanner input = new Scanner(System.in);
		int talet = 0;
		int slump = (int) (Math.random() * (max) + 1); // Det h�r slumpar talet man ska gissa
		for (int i = 0; i <= antal; i++) { // for loopen �r f�r att kolla hur m�nga chanser man har p� sig
			int k = antal - i; // �r f�r att visa hur m�nga chanser man har kvar
			if (i == antal) { // H�r hamnar man om man inte har n�gra gissningar kvar
				System.out.println("Du har inga gissningar kvar, talet var " + slump);
				igen1(); // man hamnar i metoden igen1 f�r att kolla om man vill k�ra igen
			} else {
				System.out.println("Du har " + k + " gissningar kvar");
				System.out.println();
				String spel = input.nextLine(); // H�r g�r man gissningen om man vilket tal man tror att det �r
				if (nummer(spel) == true) { // Man hamnar i metoden nummer f�r att kolla att det �r endast ett
											// heltal i
											// och inte n�gon bokstav
					talet = Integer.parseInt(spel); // Detta g�r om Stringen till en int

					if (talet == slump) { // Om man har gissat r�tt s� hammnar man h�r f�r att ber�tta att man har
											// vunnit
						int L = k - 1; // F�r att visa hur m�nga f�rs�k man hade kvar n�r man klara det
						System.out.println("Du vann GRATTIS!!! du hade " + L + " f�rs�k kvar");
						igen1();
						i = antal; // F�r att stoppa loopen
					} else { // Om man inte gissar r�tt
						if (talet > 0 && talet < (max + 1)) {// Om talet �r inte mellan 1-max s� k�rs inte denna loop
							if (slump > talet) { // Om talet �r st�rre �n r�tt svar
								System.out.println("Talet �r st�rre �n ditt tal");
							} else if (slump < talet) { // Om talet �r mindre �r r�tt tal
								System.out.println("Talet �r mindre �n ditt tal");
							}
						} else {
							i--; // F�r att man ska f� en till chans om man har gissat ett tal som inte �r mellan
									// 1-100
							System.out.println("V�lj ett tal mellan " + 1 + "-" + max);
						}
					}
				} else {
					System.out.println("V�lj ett tal mellan " + 1 + "-" + max);
					i--; // F�r att man ska f� en till chans om man har gissat med en bokstav
				}
			}

		}
	}

	/**
	 * Kollar om spel �r ett heltal utan n�gon bokstav
	 * 
	 * @param spel
	 * @return
	 */
	private static boolean nummer(String spel) {
		int length = spel.length(); // Skapar en inte som �r l�ngden p� Stringen spel som sedan anv�nds i for loopen
		if (length > 3) { // Kollar s� talet �r inte st�rre �n 100. Anv�nds mer f�r att det inte ska bli
							// error n�r man g�r ver intens storlek
			return false;
		}
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
	private static void igen1() {
		Scanner input = new Scanner(System.in);
		boolean boll = true;
		System.out.println("Vill du spela igen? Skriv 1 om du vill spela igen 0 om du inte");
		do {
			String again = input.nextLine();
			if (again.equals("1")) { // Kollar om man har skrivit 1
				boll = false; // st�nger av den h�r loopen
			} else if (again.equals("0")) { // Kollar om man har skrivit 2
				System.exit(0); // St�nger av programmet
			} else { // Om man har varken skrivit 1 eller 0
				System.out.println("Sn�lla v�lj 1 eller 0");
			}
		} while (boll == true);
	}

}
