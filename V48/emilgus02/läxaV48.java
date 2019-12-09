package emilgus02;

import java.util.Arrays;

public class l�xaV48 {

	public static void main(String[] args) {

		int[] numbers = { 1, 1, 1, 2, 6, 7, 8, 4, 3, 7, 8, 9, 3, 1, 3, 7, 8, 5, 3, 4, 8, 9, 6, 4, 2, 4, 7, 9, 7, 4, 3,
				2, 3, 6, 7, 8, 7, 7, 5, 7, 9, 6, 1, 4, 0, 8, 6, 5, 6, 8, 9, 0, 7, 5, 4, 3, 2, 4, 5, 9, 8, 5, 9, 8, 8, 4,
				5, 6, 7, 8, 9, 0, 9, 0, 9, 7, 5, 2, 1, 2, 3, 4, 5, 4, 4, 5, 3, 4, 5, 0, 8, 7, 0, 7, 9, 7, 0, 6, 5, 4 };

		String[] names = { "Crystal", "Tam", "Ed", "Beulah", "Daina", "Benjamin", "Kia", "Clelia", "Cassy", "Gita",
				"Celsa", "Karoline", "Talitha", "Lewis", "Betsy", "Colin", "Glendora", "Carola", "Rosalba", "Jeanie",
				"Yevette", "Armand", "Neal", "Lilla", "Dorethea", "Delta", "Maye", "Nikita", "Shoshana", "Carola",
				"Margie", "Haywood", "Venessa", "Natacha", "Gilbert", "Kandi", "Tyisha", "Tammie", "Blossom", "Penney",
				"Diana", "Audrey", "Willard", "Zoraida", "Drusilla", "Jacquline", "Cyndy", "Janiece", "Tressie", "Kami",
				"Lashanda", "Leann", "Tom", "Santana", "Junita", "Gisela", "Tom", "Marquerite", "Bryant", "Lauralee",
				"Yael", "Kelle", "Samantha", "Tom", "Meta", "Lanette", "Wanetta", "Carola", "Jana", "Neal", "Brady",
				"Rigoberto", "Felicia", "Hellen", "Georgeann", "Carola", "Isaias", "Ellis", "Roseanne", "Lenard", "Ela",
				"Ophelia", "Alesha", "Mafalda", "Flor", "Kelsi", "Autumn", "Sondra", "Pasty", "Jacquelyne", "Benjamin",
				"Emmie", "Mickie", "Lang", "Jamee", "Felice", "Daniella", "Carola", "Nathalie", "Genevive" };

		System.out.println("Antal 7or �r: " + numbersof7(numbers));
		System.out.println("Antal g�nger Tom st�r: " + Tom(names));
		System.out.println("Det finns mest: " + mostNumbers(numbers));
		System.out.println("Det finns minst: " + LestNumbers(numbers));
		System.out.println("Drusilla st�r p� plats: " + Drusilla(names));
		System.out.println("Alla j�mna tal blir: " + evental(numbers));
		System.out.println("Det finns s� m�nga fr�n talen 0-9 �r: " + Howmany(numbers));
		System.out.println("S� m�nga L finns det: " + allaL(names));
		System.out.println("S� m�nga namn har fem bokst�ver i sig: " + Fem(names));
	}

	/**
	 * Kollar hur m�nga namn som har fem bokst�ver i sig sedan skickar tillbaks det
	 * @param names
	 * @return
	 */
	private static int Fem(String[] names) {
		int fem = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i].length() == 5) {
				fem++;
			}
		}
		return fem;
	}

	
	/**
	 * Kollar hur namn som b�rjar p� L sedan skickar tillbaks det
	 * @param names
	 * @return
	 */
	private static int allaL(String[] names) {
		int L = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i].startsWith("L")) {
				L++;
			}
		}
		return L;
	}

	
	/**
	 * Kollar hur m�nga g�nger varje tal sedan skickar tillbaks talet
	 * @param numbers
	 * @return
	 */
	private static String Howmany(int[] numbers) {
		  int[] antal = new int[10];

	        for (int i = 0; i < 10; i++) {
	            for (int j = 0; j < numbers.length; j++) {

	                if (numbers[j] == i) {

	                    antal[i]++;

	                }

	            }
	        }

	        return Arrays.toString(antal);
	    }


	/**
	 * Kollar hur m�nga tal som �r j�mna sedan s� adderar alla de talen och efter det s� skickar det tillbaks svaret
	 * @param numbers
	 * @return
	 */
	private static int evental(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				sum = sum + numbers[i];
			}
		}
		return sum;
	}

	
	/**
	 * Kollar n�r Drusilla st�r sedan s� skickar det tillbaks svaret
	 * @param names
	 * @return
	 */
	private static int Drusilla(String[] names) {
		int Drusilla = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i].contains("Drusilla")) {
				Drusilla = i;
			}
		}
		return Drusilla;
	}

	
	/**
	 * Kollar vilket tal som st�r mest g�nger sedan skickar tillbaks det
	 * @param numbers
	 * @return
	 */
	private static int LestNumbers(int[] numbers) {
		int least = 0;
		int min = 100;

		for (int i = 0; i < 10; i++) {
			int amount = 0;
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] == i) {
					amount++;
				}
			}
			if (amount < min) {
				least = i;
				min = amount;
			}
		}
		return least;
	}

	/**
	 * Kollar vilket tal som st�r minst g�nger sedan skickar tillbaks det
	 * @param numbers
	 * @return
	 */
	private static int mostNumbers(int[] numbers) {
		int most = 0;
		int max = 0;

		for (int i = 0; i < 10; i++) {
			int amount = 0;
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] == i) {
					amount++;
				}
			}

			if (amount > max) {
				most = i;
				max = amount;
			}
		}
		return most;
	}

	/**
	 * Kollar hur m�nga g�nger Tom st�r i names
	 * @param names
	 * @return
	 */
	private static int Tom(String[] names) {
		int antal = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals("Tom")) {
				antal++;
			}
		}
		return antal;
	}

	/**
	 * Tar in numbers kollar hur m�nga 7or det finns i numbers sedan skickar tillbaks svaret
	 * @param numbers
	 * @return
	 */
	public static int numbersof7(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 7) {
				sum++;
			}
		}
		return sum;
	}

}
