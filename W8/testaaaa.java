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
		int length = max.length(); // Skapar en inte som är längden på Stringen spel som sedan används i for loopen
		if (length > 10) { // Kollar så talet är inte större än 100. Används mer för att det inte ska bli
							// error när man går ver intens storlek
			return false;
		} 
		if (max.isEmpty()) { // Kollar om man ar skrivit något i spel
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
