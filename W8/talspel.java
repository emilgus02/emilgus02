import java.util.Scanner;

public class talspel {

	/**
	 * Är menyn där spelaren får välja svårighetsgrad i spelet
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean igen = true;
		String choice;

		do {
			System.out.println("Välkommen till Guess The Number");
			System.out.println("Här kan du välja svighetsgrad på spelet");
			System.out.println("(1) Lätt: 15 Gissningar");
			System.out.println("(2) Medel: 10 Gissningar");
			System.out.println("(3) Svår: 5 Gissningar");
			System.out.println("(4) Eget: Välj egna intervall");
			System.out.println("(5) Avsluta");
			System.out.println();

			choice = input.nextLine();

			difficulty(choice, igen);
		} while (igen == true);
	}

	/**
	 * Väljer svårighetsgrad
	 * 
	 * @param choice
	 * @param igen
	 */
	private static void difficulty(String choice, boolean igen) {
		Scanner input = new Scanner(System.in);
		if (choice.equals("1")) { // Kollar om man har skrivit 1
			int antal = 15;// väljer hur många antal gissningar man har
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
			System.exit(0); // Stänger av programmet
		} else { // Om man inte skrivit ett tal mellan 1-5
			System.out.println("Snälla skriv ett tal mellan 1 och 4 tack");
		}

	}
	
	/**
	 * Väljer antalet och intervallerna i svårighetsgrad 4
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
			System.out.println("Hur många gissningar vill du ha? (Skriv gärna ett tal mellan 1 och 999999999)");
			do { // om man skriver en bokstav
				diff = false;
				max1 = input.nextLine();
				if (nummer2(max1) == true) { // Kollar om det är ett heltal
					antal = Integer.parseInt(max1); // Gör om talet till en Int

				} else {
					System.out.println();
					System.out.println("Skriv gärna ett heltal mellan 1 och 999999999");
					System.out.println("Hur många gissningar vill du ha?");
					diff = true;
				}
			} while (diff == true);
			System.out
					.println("Vad ska största talet i intervallet vara? (Skriv gärna ett tal mellan 1 och 999999999)");
			do { // Om man skriver en bokstav
				diff2 = false;
				max1 = input.nextLine();
				if (nummer2(max1) == true) {
					max = Integer.parseInt(max1); // Gör om max1 till int max
				} else {
					System.out.println();
					System.out.println("Skriv gärna ett heltal mellan 1 och 999999999");
					System.out.println("Hur många gissningar vill du ha?");
					diff2 = true;
				}
			} while (diff2 == true);
			if (max > 0 && antal > 0) { // Kollar så talet inte är under 1
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
	 * Kollar om talet är ett heltal om det är under 999999999
	 * 
	 * @param max1
	 * @return
	 */
	private static boolean nummer2(String max1) {
		int length = max1.length(); // Skapar en inte som är längden på Stringen spel som sedan används i for loopen
		if (length > 9) { // Kollar så talet är inte större än 999 999 999. Används mer för att det inte
							// ska bli
							// error när man går över intens storlek
			return false;
		}
		if (max1.isEmpty()) { // Kollar om man ar skrivit något i max1
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
	 * Här gör man själva gissningen så kollar den om talet är högre eller lägre en
	 * det talet som man har skrivit
	 * 
	 * @param igen
	 * @param antal
	 * @return
	 */
	private static void guess(int antal, int max) {
		System.out.println("Du har nu valt en svårighetsgrad");
		System.out.println("Gissa nu ett tal mellan " + 1 + "-" + max);
		Scanner input = new Scanner(System.in);
		int talet = 0;
		int slump = (int) (Math.random() * (max) + 1); // Det här slumpar talet man ska gissa
		for (int i = 0; i <= antal; i++) { // for loopen är för att kolla hur många chanser man har på sig
			int k = antal - i; // är för att visa hur många chanser man har kvar
			if (i == antal) { // Här hamnar man om man inte har några gissningar kvar
				System.out.println("Du har inga gissningar kvar, talet var " + slump);
				igen1(); // man hamnar i metoden igen1 för att kolla om man vill köra igen
			} else {
				System.out.println("Du har " + k + " gissningar kvar");
				System.out.println();
				String spel = input.nextLine(); // Här gör man gissningen om man vilket tal man tror att det är
				if (nummer(spel) == true) { // Man hamnar i metoden nummer för att kolla att det är endast ett
											// heltal i
											// och inte någon bokstav
					talet = Integer.parseInt(spel); // Detta gör om Stringen till en int

					if (talet == slump) { // Om man har gissat rätt så hammnar man här för att berätta att man har
											// vunnit
						int L = k - 1; // För att visa hur många försök man hade kvar när man klara det
						System.out.println("Du vann GRATTIS!!! du hade " + L + " försök kvar");
						igen1();
						i = antal; // För att stoppa loopen
					} else { // Om man inte gissar rätt
						if (talet > 0 && talet < (max + 1)) {// Om talet är inte mellan 1-max så körs inte denna loop
							if (slump > talet) { // Om talet är större än rätt svar
								System.out.println("Talet är större än ditt tal");
							} else if (slump < talet) { // Om talet är mindre är rätt tal
								System.out.println("Talet är mindre än ditt tal");
							}
						} else {
							i--; // För att man ska få en till chans om man har gissat ett tal som inte är mellan
									// 1-100
							System.out.println("Välj ett tal mellan " + 1 + "-" + max);
						}
					}
				} else {
					System.out.println("Välj ett tal mellan " + 1 + "-" + max);
					i--; // För att man ska få en till chans om man har gissat med en bokstav
				}
			}

		}
	}

	/**
	 * Kollar om spel är ett heltal utan någon bokstav
	 * 
	 * @param spel
	 * @return
	 */
	private static boolean nummer(String spel) {
		int length = spel.length(); // Skapar en inte som är längden på Stringen spel som sedan används i for loopen
		if (length > 3) { // Kollar så talet är inte större än 100. Används mer för att det inte ska bli
							// error när man går ver intens storlek
			return false;
		}
		if (spel.isEmpty()) { // Kollar om man ar skrivit något i spel
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
	 * Kollar om man vill köra spelet igen
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
				boll = false; // stänger av den här loopen
			} else if (again.equals("0")) { // Kollar om man har skrivit 2
				System.exit(0); // Stänger av programmet
			} else { // Om man har varken skrivit 1 eller 0
				System.out.println("Snälla välj 1 eller 0");
			}
		} while (boll == true);
	}

}
