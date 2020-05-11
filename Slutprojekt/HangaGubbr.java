import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HangaGubbr {

	public static void main(String[] args) {

		boolean igen = true;
		boolean valet = false;
		StringBuffer ordet = null; // StringBuffer �r typ som en array bara att man kan g�ra lite andra saker med
									// det

		do {
			do {
				valet = false;

				String val = Meny(); // Skickar till menyn och i menyn s� f�r man s�ga vilken sv�righetsgrad

				if (val.equals("1")) {
					ordet = Easy(); // H�r skickas man till easy och i den metoden slumpas ordet
				} else if (val.equals("2")) {
					ordet = Medium();
				} else if (val.equals("3")) {
					ordet = Hard();
				} else if (val.equals("4")) {
					ordet = Mulitplayer(); // Multiplayer om man den ena personen vill skriva ett ord och den andra ska
											// gissa
				} else if (val.equals("5")) {
						regler();
						valet = true;
				} else if (val.equals("6")) {
					System.exit(0); // St�nger av hela programmet
				} else { // Om man inte uppfyller kraven f�r menyn s� hamnar man h�r
					System.out.println("Skriv en siffra mellan 1 och 5");
					valet = true;
				}
			} while (valet == true); // loopen �r till f�r om man skriver fel s� beh�ver man inte starta om
										// programmet

			guess(ordet);// H�r skickas man till programmet som man gissar i

			again();// I den h�r metoden s� kollar man om man vill k�ra igen

		} while (igen == true); // Om man vill k�ra igen anv�nds den h�r metoden till
		
		
	}

	/**
	 * V�ljer vilket ord den andra personen ska gissa p�
	 * 
	 * @return ordet man ska gissa p�
	 */
	private static StringBuffer Mulitplayer() {
		StringBuffer ordet;
		boolean igen = false;
		System.out.println("Du har nu valt: Multiplayer");

		do { // Om man skriver en siffra ist�llet f�r bokst�ver

			if (igen == true) {
				System.out.println("Skriv endast bokst�ver");
			}

			Scanner input = new Scanner(System.in);
			System.out.println("Skriv vad ditt ord ska vara");
			ordet = new StringBuffer(input.nextLine().toUpperCase()); // H�r skriver man vilket ord det ska vara

			for (int j = 0; j < ordet.length(); j++) {
				igen = true;
				if (Character.isLetter(ordet.charAt(j))) { // Tittar att alla tecken i ordet �r bokst�ver
					if (String.valueOf(ordet).contains(" ") == false) {
						igen = false;
					}
				}
			}
		} while (igen == true);
		for (int i = 0; i < 30; i++) {// S� man inte ser vad den andra personen har skrivit
			System.out.println();
		}
		return ordet;
	}

	/**
	 * Slumpar ut ett ord ifr�n Sv�righetsgraden sv�rt
	 * 
	 * @return ordet man ska gissa p�
	 */
	private static StringBuffer Hard() {
		ArrayList<String> NameList = new ArrayList<String>();
		System.out.println("Du har nu valt sv�righetsgrad: Sv�rt");
		System.out.println();
		NameList.addAll(Arrays.asList("fartygsmotorfabrikers", "fartygsmotorindustrin", "fartygsmotorindustris",
				"fasth�llningstekniken", "fasth�llningstekniker", "fastighetsbeskattning", "fastighetsf�rvaltning",
				"fastighetsintecknings", "fastighetstaxeringars", "fastighetstaxeringens", "r�ttsskyddsf�rs�krings",
				"realisationsvinsternas", "realisationsvinstskatt", "realtidskommunikations", "reduktionspotentialens",
				"reduktionspotentialers", "reduplikationsstavelse", "registreringsavgiftens", "registreringsavgifters",
				"rehabiliteringsakt�ren", "rehabiliteringsakt�rer", "rehabiliterings�tg�rds", "rehabiliteringsbehoven",
				"rehabiliteringsbehovet", "rehabiliteringsfr�gans", "rehabiliteringsfr�gors", "rehabiliteringskarri�r",
				"�versv�mningsterrassers", "�vert�ndningspunkternas", "�vertidsers�ttningarnas",
				"�vertidstj�nstg�ringars", "�vertidstj�nstg�ringens", "�vertonsoscillatorernas",
				"�vertrasseringsavgiften", "absorptionskoefficienter", "absorptionskonstanternas",
				"absorptionskylmaskinerna", "accelerationselektrodens", "accelerationselektroders",
				"accelerationshastigheten", "accelerationshastigheter", "premiepensionsmyndigheten",
				"premiepensionsmyndigheter", "prenumerationsavgifternas", "presidentvalskampanjernas",
				"preventivmedelsr�dgivning", "sjukpenningf�rs�kringarnas", "skilsm�ssof�rhandlingarnas",
				"sm�f�retagsutvecklingarnas", "socialf�rs�kringsavgiftens", "barmh�rtighetsinr�ttningens",
				"ber�kningsbarhetsteoriernas", "biljettbokningsdatabasernas", "bilprovningsverksamheternas",
				"grundl�ggningsentreprenadens", "grundl�ggningsentreprenaders", "hush�llsmetallvaruindustrier",
				"hush�llsmetallvaruindustrins", "investeringskalkyleringarnas", "jordbruksmaskinindustriernas",
				"minoritets�terremitteringarna", "oxidationsreduktionspotential", "pensionsf�rs�kringsavgifterna",
				"plastf�rpackningsindustrierna", "produktionsstyrningssystemens", "strategievalueringsfunktionern",
				"strategievalueringsfunktioners", "tr�bearbetningsmaskinindustrie", "tr�bearbetningsmaskinindustrie",
				"tr�bearbetningsmaskinindustrie", "tr�bearbetningsmaskinindustrie"));
		int slumpa = (int) (Math.random() * (NameList.size())); // Slumpar fram ett ord ifr�n arraylisten
		StringBuffer ordet = new StringBuffer(NameList.get(slumpa).toUpperCase()); // G�r om talet till en StringBuffer
																					// f�r det finns mer metoder man kan
																					// anv�nda med StringBuffer �n
																					// ArrayList och g�r om alla
																					// bokst�ver till stora bokst�ver
		return ordet;
	}

	/**
	 * Slumpar ut ett ord ifr�n Sv�righetsgraden medium
	 * 
	 * @return ordet man ska gissa p�
	 */
	private static StringBuffer Medium() {
		ArrayList<String> NameList = new ArrayList<String>();
		System.out.println("Du har nu valt sv�righetsgrad: Sv�rt");
		System.out.println();
		NameList.addAll(Arrays.asList("abbrevierad", "abbrevierar", "abbrevieras", "abbrevierat", "abderiterna",
				"abderitiska", "abderitiske", "abderitiskt", "abdikations", "dadaisternas", "dadelk�rnans",
				"dadelk�rnors", "dadelpalmens", "dadelpalmers", "d�dl�shetens", "dagakarlarna", "backnejlikas",
				"backnejlikor", "backranunkel", "backsipporna", "backs�tornas", "tabloidformat", "tabulatorerna",
				"tabulaturerna", "taburetternas", "t�ckdikningar", "t�ckdikningen", "vaccineringar", "vaccineringen",
				"v�ckarklockan", "v�ckarklockas", "v�ckarklockor", "rackarungarnas", "rackelhanarnas", "racketsportens",
				"racketsporters", "rackmonterades", "radannonsernas", "�lderdomssvage", "�lderdomssvagt",
				"�ldersgr�nsens", "�ldersgr�nsers", "�ldersgruppens", "�ldersgruppers", "�ldersklassens",
				"�ldersklassers", "temperaturstyrt", "tenorsaxofonist", "termoelektriskt", "termomagnetiskt",
				"terrorangreppet", "testamentariskt", "tidspecificerat", "tillbakapressat", "tillbakaskjutet",
				"ekonomisystemet", "ekvilibristiskt", "elektrocykliskt", "elektrometriskt", "elektronegativt",
				"elektronikstyrt", "namngivningarnas", "namns�kerheterna", "namnteckningarna", "napoleonbakelsen",
				"napoleonbakelser", "napoleonbakelses", "napoleont�rtorna", "r�bandsknoparnas", "rabarberkompotts",
				"rabarberkr�merna", "rabarberpajernas", "rabarbersafterna", "rabarberstj�lkar", "rabarberstj�lken",
				"rabarbervinernas", "rabatteringarnas", "�nggenomsl�ppligt", "anknytningsfallet", "anknytningsnumret",
				"anpassningsbarast", "anslutningsavgift", "antikommunistiskt", "antisladdsystemet",
				"antibiotikakurerna", "antiintellektuella", "antikapitalistiska", "antikonceptionella",
				"antimilitaristiska", "antiperspiranterna", "antropomorfistiska", "f�rfallodagsklausul",
				"fortskaffningsmedel", "f�rvaltningsdomstol", "medbest�mmandeavtal", "oxidationspotential",
				"absorptionsfusioners", "absorptionskapacitet", "absorptionskolonnens", "absorptionskolonners",
				"absorptionskomplexen", "absorptionskomplexet", "absorptionskonstants"));
		int slumpa = (int) (Math.random() * (NameList.size()));
		StringBuffer ordet = new StringBuffer(NameList.get(slumpa).toUpperCase());
		return ordet;
	}

	/**
	 * Slumpar ut ett ord ifr�n Sv�righetsgraden l�tt
	 * 
	 * @return ordet man ska gissa p�
	 */
	private static StringBuffer Easy() {
		ArrayList<String> NameList = new ArrayList<String>();
		System.out.println("Du har nu valt sv�righetsgrad: L�tt");
		System.out.println();
		NameList.addAll(Arrays.asList("m�", "mo", "m�", "hy", "id", "il", "r�", "ax", "b�", "be", "�ar", "�bo", "�da",
				"�ga", "�gd", "agg", "�gg", "agn", "ert", "ess", "est", "eta", "rap", "rar", "r�r", "ras", "r�s",
				"agio", "agna", "�gna", "agns", "amma", "�mna", "�mne", "amok", "ekan", "ekar", "eka", "ekat", "eken",
				"eker", "l�ms", "lamt", "lana", "l�na", "land", "l�nd", "�dror", "aerob", "afasi", "aff�r", "affin",
				"affix", "afron", "k�dan", "k�das", "kader", "k�dig", "kadin", "kadis", "kaf�s", "kaf�t", "taken",
				"taket", "takts", "t�kts", "talan", "talar", "talas", "zoners", "zoolog", "zoomad", "zoomar", "zoomas",
				"�dmjuk", "�dslad", "�dslar", "�dslas", "�dslat", "�dslig", "	", "s�arnas", "sabbade", "sabbats",
				"sabelns", "sablade", "sablars", "sablats", "sabot�r", "sackade", "s�ckade", "s�ckars", "s�ckens",
				"s�ckiga", "s�ckigt", "s�ckv�v", "s�ddens", "s�dders", "sadduc�", "sadelns", "sadisms", "sadists",
				"sadlade", "sadlars", "sadlats", "safarin", "safaris", "saffian", "saffran", "safiren", "safirer",
				"s�framt", "saftade", "v�durens", "v�fflans", "v�fflors", "vagabond", "vaganten", "vaganter",
				"xylograf", "absorbans", "absorbent", "absorbera", "ub�tsfr�ga", "ub�tsjakts", "uddaplaggs",
				"uddigheten", "uddigheter", "uddl�shets", "uddrimmens", "uddrimmets", "uefacupens"));
		int slumpa = (int) (Math.random() * (NameList.size()));
		StringBuffer ordet = new StringBuffer(NameList.get(slumpa).toUpperCase());
		return ordet;
	}

	/**
	 * Man f�r best�mma vilken sv�righetsgrad man vill g�ra, kollar reglerna eller
	 * st�nga av programmet
	 * 
	 * @return
	 */
	private static String Meny() {
		Scanner input = new Scanner(System.in);
		String choice;

		System.out.println("V�lkommen till H�nga Gubbe");
		System.out.println("(1) L�tt 2-10 bokst�ver");
		System.out.println("(2) Medel 11-20 bokst�ver");
		System.out.println("(3) Sv�r 21-30 bokst�ver");
		System.out.println("(4) Multiplayer");
		System.out.println("(5) Regler");
		System.out.println("(6) Avsluta");
		System.out.println();

		choice = input.nextLine(); // H�r v�ljer man vilken meny man ska g� till

		return choice;

	}

	/**
	 * Ber�ttar reglerna till spelet
	 * 
	 * @param valet
	 */
	private static void regler() {
		System.out.println("Om du alrig har spelat h�ngagubbe innan s� g�r det till s� h�r");
		System.out.println();
		System.out.println(
				"Ett ord kommer att slumpm�ssigt v�ljas ut till dig (beroende p� svprighetsgrad) som du kommer f� gissa vilka bokst�ver som �r med i ordet");
		System.out.println(
				"Om bokstaven �r inte med s� kommer en gubbe som h�ngs b�rjat ritas fram och du kommer att f� 7 chanser att gissa fel");
		System.out.println(
				"Om bokstaven �r med s� kommer bokstaven visas vart det �r i ordet och du kommer att f� gissa igen");
		System.out.println(
				"Du vinner n�r du har skrivit hela ordet eller du har skrivit alla bokst�ver som �r med i ordet");
		System.out.println(
				"Du f�rlorar n�r hela gubben har blivit ritad allts� n�r du inte har n�gra fler gissningar kvar");
		System.out.println();
		System.out.println("Multiplayer");
		System.out.println(
				"Multiplayer d� f�r en person skriva ett ord sedan s� kommer den andra personen f� en chans att gissa p� vilket ord du har skrivit");
		System.out.println(
				"N�r man skriver ordet s� kan man inte anv�nda mellanslag eller anv�nda n�gra siffror eller andra symboler f�ra att skriva ordet");
		System.out.println();
		System.out.println("N�r du har l�st klart och vill spela s� kan du skriva 1 f�r att komma tillbaks till menyn");

		Scanner input = new Scanner(System.in);
		boolean igen = true;
		do {
			String again = input.nextLine();
			if (again.equals("1")) { // Kollar om man har skrivit 1
				igen = false; // st�nger av den h�r loopen
			} else { // Om man har varken skrivit 1 eller 0
				System.out.println("V�nligen skriv 1 om du vill g� tillbaks till menyn");
			}
		} while (igen == true);

	}

	/**
	 * H�r f�r man gissa vad det �r f�r ord och den kollar �ven om bokstaven finns
	 * med i ordet
	 * 
	 * @param ordet, ordet som slumpades ut tidigare
	 */
	private static void guess(StringBuffer ordet) {
		ArrayList<String> anv�nda = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		String repeated = null;
		StringBuffer Hemligt = new StringBuffer(repeated = new String(new char[(ordet.length())]).replace("\0", "_")); // H�r
																														// loopar
																														// man
																														// "_"
																														// s�
																														// det
																														// blir
																														// lika
																														// m�nga
																														// "_"
																														// som
																														// det
																														// var
																														// bokst�ver
																														// i
																														// ordet
																														// och
																														// sedan
																														// l�gger
																														// man
																														// in
																														// dem
																														// i
																														// en
																														// StringBuffer
		for (int k = 1; k < (ordet.length() + ordet.length()); k++) {
			Hemligt.insert(k, " ");// H�r l�gger man till mellanslag mellan varje "_" f�r att det ska bli l�ttare
									// att se hur m�nga bokst�ver det �r
			k++;
		}

		for (int i = 0; i <= 6;) {// antalet f�rs�k man har p� sig

			System.out.println();
			System.out.println(Hemligt);
			System.out.println();
			System.out.println("Skriv en bokstav");
			System.out.println();
			System.out.print("Du har anv�nt: ");

			for (int j = 0; j < anv�nda.size(); j++) { // Skriver ut vilka bokst�ver man har andv�nt
				System.out.print(anv�nda.get(j) + ", ");
			}
			System.out.println();

			String Gissat = input.next().toUpperCase(); // Gissar vilket ord det �r och sedan g�r om bokst�ver till
														// stora bokst�ver
			char Gissning = Gissat.charAt(0); // G�r om det man gissade till en char

			if (Gissat.equals(ordet.toString())) {// Den kollar om man har skrivit r�tt ord
				Vann(ordet);
				i = 7; // St�nger av loppen

			} else if (kolla(Gissning, anv�nda, Gissat) == true) { // Kollar att det inte �r en siffra, att det inte �r
																	// mer �n en bokstav och att man inte har skrivit
																	// bokstaven innan
				if (!(ordet.toString().contains(Gissat))) { // Kollar om bokstaven inte finns med i ordet
					gubben(i, ordet);// H�r ritas gubben upp
					i++;
				} else {
					for (int j = 0; j < ordet.length(); j++) {
						if (ordet.charAt(j) == Gissning) {// Kollar om bokstaven �r med i ordet och is�fall vart
							for (int k = 1; k < Hemligt.length(); k++) {
								Hemligt.delete(k, k + 1);// Tar bort alla mellanslag ifr�n Hemligt ("_")
							}
							Hemligt.replace(j, j + 1, String.valueOf(Gissning)); // Byter ut "_" mot bokstaven man skrev
																					// p� r�tt plats
							if (ordet.toString().equals(Hemligt.toString()) == true) {// Kollar om man hela ordet �r
																						// skrivet
								Vann(ordet);
								i = 7; // St�nger av loopen
							}
							for (int k = 1; k < ordet.length() * 2; k++) {// l�gger till alla mellanslag igen
								Hemligt.insert(k, " ");
								k++;
							}
						}
					}
				}

			}

		}

	}

	/**
	 * Kollar att det �r en bokstav, att man har bara skrivit en bokstav och att man
	 * inte har skrivit bokstaven innn
	 * 
	 * @param Gissning
	 * @param anv�nda
	 * @param Gissat
	 * @return
	 */
	private static boolean kolla(char Gissning, ArrayList<String> anv�nda, String Gissat) {
		String kollar = String.valueOf(Gissning); // G�r om gissningen till en string igen
		if (Gissat.length() == 1) {// kollar att man har skrivit en bokstav
			for (int i = 0; i <= anv�nda.size();) {

				if (anv�nda.contains(kollar) == false) {// Kollar om man har skrivit bokstaven innan

					if (Character.isLetter(kollar.charAt(i)) == true) {// Kollar att alla tecken �r Strings
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

	/**
	 * Ett grattismedelande om man klara det
	 * 
	 * @param ordet
	 */
	private static void Vann(StringBuffer ordet) {
		System.out.println("Grattis du vann ordet var " + ordet);
	}

	/**
	 * Ritar ut gubben om man har gissat fel och s�ger om man har f�rlorat
	 * 
	 * @param i
	 * @param ordet
	 */
	private static void gubben(int i, StringBuffer ordet) {
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
			System.out.println("Fel gissning, Game Over" + "Ordet var: " + ordet);
			System.out.println("   ____________");
			System.out.println("   |           |");
			System.out.println("   |           O");
			System.out.println("   |         --|--");
			System.out.println("   |           |");
			System.out.println("   |          / \\");
			System.out.println("   |         /   \\");
			System.out.println("   |           ");
			System.out.println("___|___         ");
		}
	}

	/**
	 * Kollar om man vill k�ra igen eller vill avsluta spelet
	 */
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