import java.util.Scanner;

import com.sun.xml.internal.ws.util.StringUtils;

public class testaaaa {

	public static void main(String[] args) {

		String max = box();
		
		if(random(max) == true) {
			System.out.println(max);
		} else {
			System.out.println("fel");
		}
	}

	private static boolean random(String max) {
		int length = max.length(); // Skapar en inte som �r l�ngden p� Stringen spel som sedan anv�nds i for loopen
		if (length > 10) { // Kollar s� talet �r inte st�rre �n 100. Anv�nds mer f�r att det inte ska bli
							// error n�r man g�r ver intens storlek
			return false;
		} 
		if (max.isEmpty()) { // Kollar om man ar skrivit n�got i spel
			return false;
		}
		for (int i = 0; i < length; i++) {
			if (Character.isDigit(max.charAt(i)) == false) { // isDigit kollar om det bara i siffror i spel
				return false;
			}
		}
		return true;
	}

	private static String box() {
		Scanner input = new Scanner(System.in);
		System.out.println("skriv nptt");
		String diff = input.nextLine();
		return diff;
	}
}
