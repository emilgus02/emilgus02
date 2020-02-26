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

		while (igen == true) {
			System.out.println("Välkommen till Guess The Number");
			System.out.println("Här kan du välja svighetsgrad på spelet");
			System.out.println("(1) Lätt: 15 Gissningar");
			System.out.println("(2) Medel: 10 Gissningar");
			System.out.println("(3) Svår: 5 Gissningar");
			System.out.println("(4) Master: 1 Gissning");
			System.out.println("(5) Avsluta");
			System.out.println();

			choice = input.nextLine();

			if (choice.equals("1")) { // Kollar om man har skrivit 1
				int antal = 15; // väljer hur många antal gissningar man har
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
				System.exit(0); // Stänger av programmet
			} else { // Om man inte skrivit ett tal mellan 1-5
				System.out.println("Snälla skriv ett tal mellan 1 och 4 tack");
			}
		}
	}

	/**
	 * Här gör man också en gissning bara att det är en annan svårhetes grad så man
	 * får bara en chans på sig
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
					if (talet == slump) { // Kollar om man har rätt
						System.out.println("Du vann GRATTIS!!! du är nu är Master ");
						System.out.println("Vill du spela igen? Skriv 1 om du vill spela igen 0 om du inte");
						car = false;
					} else {
						System.out.println("Du har inga gissningar kvar, talet var " + slump);
						System.out.println("Vill du spela igen? Skriv 1 om du vill spela igen 0 om du inte");
						car = false;
					}
				} else {
					System.out.println("Välj gärna ett heltal mellan 1-100");
				}
			} else {
				System.out.println("Välj gärna ett heltal mellan 1-100");
			}
		} while (car == true);

		igen1(igen); // Man hamnar i metoden igen1 för att kolla om man vill köra igen

		return igen; // Returnar igen om man vill köra igen
	}

	/**
	 * Här gör man själva gissningen så kollar den om talet är högre eller lägre en
	 * det talet som man har skrivit
	 * 
	 * @param igen
	 * @param antal
	 * @return
	 */
	private static boolean guess(boolean igen, int antal) {
		System.out.println("Du har nu valt en svårighetsgrad");
		System.out.println("Gissa nu ett tal mellan 1-100");
		Scanner input = new Scanner(System.in);
		int talet = 0;
		int slump = (int) (Math.random() * (100) + 1); // Det här slumpar talet man ska gissa

		for (int i = 0; i <= antal; i++) { // for loopen är för att kolla hur många chanser man har på sig
			int k = antal - i; // är för att visa hur många chanser man har kvar
			if (i == antal) { // Här hamnar man om man inte har några gissningar kvar
				System.out.println("Du har inga gissningar kvar, talet var " + slump);
				System.out.println("Vill du spela igen? Skriv 1 om du vill spela igen 0 om du inte");
				igen1(igen); // man hamnar i metoden igen1 för att kolla om man vill köra igen
			} else {
				System.out.println("Du har " + k + " gissningar kvar");
				String spel = input.nextLine(); // Här gör man gissningen om man vilket tal man tror att det är
				if (nummer(spel) == true) { // Man hamnar i metoden nummer för att kolla att det är endast ett heltal i
											// och inte någon bokstav
					talet = Integer.parseInt(spel); // Detta gör om Stringen till en int

					if (talet == slump) { // Om man har gissat rätt så hammnar man här för att berätta att man har
											// vunnit
						int L = k - 1; // För att visa hur många försök man hade kvar när man klara det
						System.out.println("Du vann GRATTIS!!! du hade " + L + " försök kvar");
						System.out.println("Vill du spela igen? Skriv 1 om du vill spela igen 0 om du inte");
						igen1(igen);
						i = antal; // För att stoppa loopen
					} else { // Om man inte gissar rätt
						if (talet > 0 && talet < 101) {// Om talet är inte mellan 1-100 så körs inte denna loop
							if (slump > talet) { // Om talet är större än rätt svar
								System.out.println("Talet är större än ditt tal");
							} else if (slump < talet) { // Om talet är mindre är rätt tal
								System.out.println("Talet är mindre än ditt tal");
							}
						} else {
							i--; // För att man ska få en till chans om man har gissat ett tal som inte är mellan
									// 1-100
							System.out.println("Välj ett tal mellan 1-100");
						}
					}
				} else {
					System.out.println("Välj gärna ett heltal mellan 1-100");
					i--; // För att man ska få en till chans om man har gissat med en bokstav
				}
			}

		}
		return igen; // Returnar igen om man vill köra igen
	}

	/**
	 * Kollar om spel är ett heltal utan någon bokstav
	 * 
	 * @param spel
	 * @return
	 */
	private static boolean nummer(String spel) {
		int length = spel.length(); // Skapar en inte som är längden på Stringen spel som sedan används i for loopen
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
	private static boolean igen1(boolean igen) {
		Scanner input = new Scanner(System.in);
		boolean boll = true;
		do {
			String again = input.nextLine();
			if (again.equals("1")) { // Kollar om man har skrivit 1
				igen = true; // säger att man vill köra igen
				boll = false; // stänger av den här loopen
			} else if (again.equals("0")) { // Kollar om man har skrivit 2
				System.exit(0); // Stänger av programmet
			} else { // Om man har varken skrivit 1 eller 0
				System.out.println("Snälla välj 1 eller 0");
			}
		} while (boll == true);
		return igen; // Returnar igen för att man för att veta om man vill köra igen eller inte
	}

}
