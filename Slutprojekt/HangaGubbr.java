import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HangaGubbr {

	public static void main(String[] args) {

		boolean igen = true;
		boolean valet = false;
		StringBuffer ordet = null; // StringBuffer är typ som en array bara att man kan göra lite andra saker med
									// det

		do {
			do {
				valet = false;

				String val = Meny(); // Skickar till menyn och i menyn så får man säga vilken svårighetsgrad

				if (val.equals("1")) {
					ordet = Easy(); // Här skickas man till easy och i den metoden slumpas ordet
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
					System.exit(0); // Stänger av hela programmet
				} else { // Om man inte uppfyller kraven för menyn så hamnar man här
					System.out.println("Skriv en siffra mellan 1 och 5");
					valet = true;
				}
			} while (valet == true); // loopen är till för om man skriver fel så behöver man inte starta om
										// programmet

			guess(ordet);// Här skickas man till programmet som man gissar i

			again();// I den här metoden så kollar man om man vill köra igen

		} while (igen == true); // Om man vill köra igen används den här metoden till
		
		
	}

	/**
	 * Väljer vilket ord den andra personen ska gissa på
	 * 
	 * @return ordet man ska gissa på
	 */
	private static StringBuffer Mulitplayer() {
		StringBuffer ordet;
		boolean igen = false;
		System.out.println("Du har nu valt: Multiplayer");

		do { // Om man skriver en siffra istället för bokstäver

			if (igen == true) {
				System.out.println("Skriv endast bokstäver");
			}

			Scanner input = new Scanner(System.in);
			System.out.println("Skriv vad ditt ord ska vara");
			ordet = new StringBuffer(input.nextLine().toUpperCase()); // Här skriver man vilket ord det ska vara

			for (int j = 0; j < ordet.length(); j++) {
				igen = true;
				if (Character.isLetter(ordet.charAt(j))) { // Tittar att alla tecken i ordet är bokstäver
					if (String.valueOf(ordet).contains(" ") == false) {
						igen = false;
					}
				}
			}
		} while (igen == true);
		for (int i = 0; i < 30; i++) {// Så man inte ser vad den andra personen har skrivit
			System.out.println();
		}
		return ordet;
	}

	/**
	 * Slumpar ut ett ord ifrån Svårighetsgraden svårt
	 * 
	 * @return ordet man ska gissa på
	 */
	private static StringBuffer Hard() {
		ArrayList<String> NameList = new ArrayList<String>();
		System.out.println("Du har nu valt svårighetsgrad: Svårt");
		System.out.println();
		NameList.addAll(Arrays.asList("fartygsmotorfabrikers", "fartygsmotorindustrin", "fartygsmotorindustris",
				"fasthållningstekniken", "fasthållningstekniker", "fastighetsbeskattning", "fastighetsförvaltning",
				"fastighetsintecknings", "fastighetstaxeringars", "fastighetstaxeringens", "rättsskyddsförsäkrings",
				"realisationsvinsternas", "realisationsvinstskatt", "realtidskommunikations", "reduktionspotentialens",
				"reduktionspotentialers", "reduplikationsstavelse", "registreringsavgiftens", "registreringsavgifters",
				"rehabiliteringsaktören", "rehabiliteringsaktörer", "rehabiliteringsåtgärds", "rehabiliteringsbehoven",
				"rehabiliteringsbehovet", "rehabiliteringsfrågans", "rehabiliteringsfrågors", "rehabiliteringskarriär",
				"översvämningsterrassers", "övertändningspunkternas", "övertidsersättningarnas",
				"övertidstjänstgöringars", "övertidstjänstgöringens", "övertonsoscillatorernas",
				"övertrasseringsavgiften", "absorptionskoefficienter", "absorptionskonstanternas",
				"absorptionskylmaskinerna", "accelerationselektrodens", "accelerationselektroders",
				"accelerationshastigheten", "accelerationshastigheter", "premiepensionsmyndigheten",
				"premiepensionsmyndigheter", "prenumerationsavgifternas", "presidentvalskampanjernas",
				"preventivmedelsrådgivning", "sjukpenningförsäkringarnas", "skilsmässoförhandlingarnas",
				"småföretagsutvecklingarnas", "socialförsäkringsavgiftens", "barmhärtighetsinrättningens",
				"beräkningsbarhetsteoriernas", "biljettbokningsdatabasernas", "bilprovningsverksamheternas",
				"grundläggningsentreprenadens", "grundläggningsentreprenaders", "hushållsmetallvaruindustrier",
				"hushållsmetallvaruindustrins", "investeringskalkyleringarnas", "jordbruksmaskinindustriernas",
				"minoritetsåterremitteringarna", "oxidationsreduktionspotential", "pensionsförsäkringsavgifterna",
				"plastförpackningsindustrierna", "produktionsstyrningssystemens", "strategievalueringsfunktionern",
				"strategievalueringsfunktioners", "träbearbetningsmaskinindustrie", "träbearbetningsmaskinindustrie",
				"träbearbetningsmaskinindustrie", "träbearbetningsmaskinindustrie"));
		int slumpa = (int) (Math.random() * (NameList.size())); // Slumpar fram ett ord ifrån arraylisten
		StringBuffer ordet = new StringBuffer(NameList.get(slumpa).toUpperCase()); // Gör om talet till en StringBuffer
																					// för det finns mer metoder man kan
																					// använda med StringBuffer än
																					// ArrayList och gör om alla
																					// bokstäver till stora bokstäver
		return ordet;
	}

	/**
	 * Slumpar ut ett ord ifrån Svårighetsgraden medium
	 * 
	 * @return ordet man ska gissa på
	 */
	private static StringBuffer Medium() {
		ArrayList<String> NameList = new ArrayList<String>();
		System.out.println("Du har nu valt svårighetsgrad: Svårt");
		System.out.println();
		NameList.addAll(Arrays.asList("abbrevierad", "abbrevierar", "abbrevieras", "abbrevierat", "abderiterna",
				"abderitiska", "abderitiske", "abderitiskt", "abdikations", "dadaisternas", "dadelkärnans",
				"dadelkärnors", "dadelpalmens", "dadelpalmers", "dådlöshetens", "dagakarlarna", "backnejlikas",
				"backnejlikor", "backranunkel", "backsipporna", "backsötornas", "tabloidformat", "tabulatorerna",
				"tabulaturerna", "taburetternas", "täckdikningar", "täckdikningen", "vaccineringar", "vaccineringen",
				"väckarklockan", "väckarklockas", "väckarklockor", "rackarungarnas", "rackelhanarnas", "racketsportens",
				"racketsporters", "rackmonterades", "radannonsernas", "ålderdomssvage", "ålderdomssvagt",
				"åldersgränsens", "åldersgränsers", "åldersgruppens", "åldersgruppers", "åldersklassens",
				"åldersklassers", "temperaturstyrt", "tenorsaxofonist", "termoelektriskt", "termomagnetiskt",
				"terrorangreppet", "testamentariskt", "tidspecificerat", "tillbakapressat", "tillbakaskjutet",
				"ekonomisystemet", "ekvilibristiskt", "elektrocykliskt", "elektrometriskt", "elektronegativt",
				"elektronikstyrt", "namngivningarnas", "namnsäkerheterna", "namnteckningarna", "napoleonbakelsen",
				"napoleonbakelser", "napoleonbakelses", "napoleontårtorna", "råbandsknoparnas", "rabarberkompotts",
				"rabarberkrämerna", "rabarberpajernas", "rabarbersafterna", "rabarberstjälkar", "rabarberstjälken",
				"rabarbervinernas", "rabatteringarnas", "ånggenomsläppligt", "anknytningsfallet", "anknytningsnumret",
				"anpassningsbarast", "anslutningsavgift", "antikommunistiskt", "antisladdsystemet",
				"antibiotikakurerna", "antiintellektuella", "antikapitalistiska", "antikonceptionella",
				"antimilitaristiska", "antiperspiranterna", "antropomorfistiska", "förfallodagsklausul",
				"fortskaffningsmedel", "förvaltningsdomstol", "medbestämmandeavtal", "oxidationspotential",
				"absorptionsfusioners", "absorptionskapacitet", "absorptionskolonnens", "absorptionskolonners",
				"absorptionskomplexen", "absorptionskomplexet", "absorptionskonstants"));
		int slumpa = (int) (Math.random() * (NameList.size()));
		StringBuffer ordet = new StringBuffer(NameList.get(slumpa).toUpperCase());
		return ordet;
	}

	/**
	 * Slumpar ut ett ord ifrån Svårighetsgraden lätt
	 * 
	 * @return ordet man ska gissa på
	 */
	private static StringBuffer Easy() {
		ArrayList<String> NameList = new ArrayList<String>();
		System.out.println("Du har nu valt svårighetsgrad: Lätt");
		System.out.println();
		NameList.addAll(Arrays.asList("må", "mo", "mö", "hy", "id", "il", "rå", "ax", "bä", "be", "åar", "åbo", "åda",
				"äga", "ägd", "agg", "ägg", "agn", "ert", "ess", "est", "eta", "rap", "rar", "rår", "ras", "rås",
				"agio", "agna", "ägna", "agns", "amma", "ämna", "ämne", "amok", "ekan", "ekar", "eka", "ekat", "eken",
				"eker", "läms", "lamt", "lana", "låna", "land", "länd", "ådror", "aerob", "afasi", "affär", "affin",
				"affix", "afron", "kådan", "kådas", "kader", "kådig", "kadin", "kadis", "kafés", "kafét", "taken",
				"taket", "takts", "täkts", "talan", "talar", "talas", "zoners", "zoolog", "zoomad", "zoomar", "zoomas",
				"ödmjuk", "ödslad", "ödslar", "ödslas", "ödslat", "ödslig", "	", "såarnas", "sabbade", "sabbats",
				"sabelns", "sablade", "sablars", "sablats", "sabotör", "sackade", "säckade", "säckars", "säckens",
				"säckiga", "säckigt", "säckväv", "såddens", "sådders", "sadducé", "sadelns", "sadisms", "sadists",
				"sadlade", "sadlars", "sadlats", "safarin", "safaris", "saffian", "saffran", "safiren", "safirer",
				"såframt", "saftade", "vädurens", "våfflans", "våfflors", "vagabond", "vaganten", "vaganter",
				"xylograf", "absorbans", "absorbent", "absorbera", "ubåtsfråga", "ubåtsjakts", "uddaplaggs",
				"uddigheten", "uddigheter", "uddlöshets", "uddrimmens", "uddrimmets", "uefacupens"));
		int slumpa = (int) (Math.random() * (NameList.size()));
		StringBuffer ordet = new StringBuffer(NameList.get(slumpa).toUpperCase());
		return ordet;
	}

	/**
	 * Man får bestämma vilken svårighetsgrad man vill göra, kollar reglerna eller
	 * stänga av programmet
	 * 
	 * @return
	 */
	private static String Meny() {
		Scanner input = new Scanner(System.in);
		String choice;

		System.out.println("Välkommen till Hänga Gubbe");
		System.out.println("(1) Lätt 2-10 bokstäver");
		System.out.println("(2) Medel 11-20 bokstäver");
		System.out.println("(3) Svår 21-30 bokstäver");
		System.out.println("(4) Multiplayer");
		System.out.println("(5) Regler");
		System.out.println("(6) Avsluta");
		System.out.println();

		choice = input.nextLine(); // Här väljer man vilken meny man ska gå till

		return choice;

	}

	/**
	 * Berättar reglerna till spelet
	 * 
	 * @param valet
	 */
	private static void regler() {
		System.out.println("Om du alrig har spelat hängagubbe innan så går det till så här");
		System.out.println();
		System.out.println(
				"Ett ord kommer att slumpmässigt väljas ut till dig (beroende på svprighetsgrad) som du kommer få gissa vilka bokstäver som är med i ordet");
		System.out.println(
				"Om bokstaven är inte med så kommer en gubbe som hängs börjat ritas fram och du kommer att få 7 chanser att gissa fel");
		System.out.println(
				"Om bokstaven är med så kommer bokstaven visas vart det är i ordet och du kommer att få gissa igen");
		System.out.println(
				"Du vinner när du har skrivit hela ordet eller du har skrivit alla bokstäver som är med i ordet");
		System.out.println(
				"Du förlorar när hela gubben har blivit ritad alltså när du inte har några fler gissningar kvar");
		System.out.println();
		System.out.println("Multiplayer");
		System.out.println(
				"Multiplayer då får en person skriva ett ord sedan så kommer den andra personen få en chans att gissa på vilket ord du har skrivit");
		System.out.println(
				"När man skriver ordet så kan man inte använda mellanslag eller använda några siffror eller andra symboler föra att skriva ordet");
		System.out.println();
		System.out.println("När du har läst klart och vill spela så kan du skriva 1 för att komma tillbaks till menyn");

		Scanner input = new Scanner(System.in);
		boolean igen = true;
		do {
			String again = input.nextLine();
			if (again.equals("1")) { // Kollar om man har skrivit 1
				igen = false; // stänger av den här loopen
			} else { // Om man har varken skrivit 1 eller 0
				System.out.println("Vänligen skriv 1 om du vill gå tillbaks till menyn");
			}
		} while (igen == true);

	}

	/**
	 * Här får man gissa vad det är för ord och den kollar även om bokstaven finns
	 * med i ordet
	 * 
	 * @param ordet, ordet som slumpades ut tidigare
	 */
	private static void guess(StringBuffer ordet) {
		ArrayList<String> använda = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		String repeated = null;
		StringBuffer Hemligt = new StringBuffer(repeated = new String(new char[(ordet.length())]).replace("\0", "_")); // Här
																														// loopar
																														// man
																														// "_"
																														// så
																														// det
																														// blir
																														// lika
																														// många
																														// "_"
																														// som
																														// det
																														// var
																														// bokstäver
																														// i
																														// ordet
																														// och
																														// sedan
																														// lägger
																														// man
																														// in
																														// dem
																														// i
																														// en
																														// StringBuffer
		for (int k = 1; k < (ordet.length() + ordet.length()); k++) {
			Hemligt.insert(k, " ");// Här lägger man till mellanslag mellan varje "_" för att det ska bli lättare
									// att se hur många bokstäver det är
			k++;
		}

		for (int i = 0; i <= 6;) {// antalet försök man har på sig

			System.out.println();
			System.out.println(Hemligt);
			System.out.println();
			System.out.println("Skriv en bokstav");
			System.out.println();
			System.out.print("Du har använt: ");

			for (int j = 0; j < använda.size(); j++) { // Skriver ut vilka bokstäver man har andvänt
				System.out.print(använda.get(j) + ", ");
			}
			System.out.println();

			String Gissat = input.next().toUpperCase(); // Gissar vilket ord det är och sedan gör om bokstäver till
														// stora bokstäver
			char Gissning = Gissat.charAt(0); // Gör om det man gissade till en char

			if (Gissat.equals(ordet.toString())) {// Den kollar om man har skrivit rätt ord
				Vann(ordet);
				i = 7; // Stänger av loppen

			} else if (kolla(Gissning, använda, Gissat) == true) { // Kollar att det inte är en siffra, att det inte är
																	// mer än en bokstav och att man inte har skrivit
																	// bokstaven innan
				if (!(ordet.toString().contains(Gissat))) { // Kollar om bokstaven inte finns med i ordet
					gubben(i, ordet);// Här ritas gubben upp
					i++;
				} else {
					for (int j = 0; j < ordet.length(); j++) {
						if (ordet.charAt(j) == Gissning) {// Kollar om bokstaven är med i ordet och isåfall vart
							for (int k = 1; k < Hemligt.length(); k++) {
								Hemligt.delete(k, k + 1);// Tar bort alla mellanslag ifrån Hemligt ("_")
							}
							Hemligt.replace(j, j + 1, String.valueOf(Gissning)); // Byter ut "_" mot bokstaven man skrev
																					// på rätt plats
							if (ordet.toString().equals(Hemligt.toString()) == true) {// Kollar om man hela ordet är
																						// skrivet
								Vann(ordet);
								i = 7; // Stänger av loopen
							}
							for (int k = 1; k < ordet.length() * 2; k++) {// lägger till alla mellanslag igen
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
	 * Kollar att det är en bokstav, att man har bara skrivit en bokstav och att man
	 * inte har skrivit bokstaven innn
	 * 
	 * @param Gissning
	 * @param använda
	 * @param Gissat
	 * @return
	 */
	private static boolean kolla(char Gissning, ArrayList<String> använda, String Gissat) {
		String kollar = String.valueOf(Gissning); // Gör om gissningen till en string igen
		if (Gissat.length() == 1) {// kollar att man har skrivit en bokstav
			for (int i = 0; i <= använda.size();) {

				if (använda.contains(kollar) == false) {// Kollar om man har skrivit bokstaven innan

					if (Character.isLetter(kollar.charAt(i)) == true) {// Kollar att alla tecken är Strings
						använda.add(kollar);
						return true;

					} else {
						System.out.println("Vänligen skriv en bokstav");
						return false;
					}
				} else {
					System.out.println("Vänligen skriv inte en bokstav som du redan har innan");
					return false;
				}
			}
		} else {
			System.out.println("Vänligen skriv endast en bokstav");
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
	 * Ritar ut gubben om man har gissat fel och säger om man har förlorat
	 * 
	 * @param i
	 * @param ordet
	 */
	private static void gubben(int i, StringBuffer ordet) {
		if (i == 0) {
			System.out.println("Fel gissning, försök igen");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("___|___");
			System.out.println();
		}
		if (i == 1) {
			System.out.println("Fel gissning, försök igen");
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
			System.out.println("Fel gissning, försök igen");
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
			System.out.println("Fel gissning, försök igen");
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
			System.out.println("Fel gissning, försök igen");
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
			System.out.println("Fel gissning, försök igen");
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
	 * Kollar om man vill köra igen eller vill avsluta spelet
	 */
	private static void again() {
		Scanner input = new Scanner(System.in);
		boolean igen = true;
		System.out.println("Vill du spela igen? Skriv 1 om du vill spela igen 0 om du inte");
		do {
			String again = input.nextLine();
			if (again.equals("1")) { // Kollar om man har skrivit 1
				igen = false; // stänger av den här loopen
			} else if (again.equals("0")) { // Kollar om man har skrivit 2
				System.exit(0); // Stänger av programmet
			} else { // Om man har varken skrivit 1 eller 0
				System.out.println("Snälla välj 1 eller 0");
			}
		} while (igen == true);
	}
}