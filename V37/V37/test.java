package V37;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner input = new Scanner(System.in); // beh�vs om man vill ha input
		
		String namn1 = "Tomas Weis";
		String namn2 = "Andreas Ohlsson";
		String namn3 = "Zachris Markstr�m Stenhammar";
		
		System.out.println("Skriv ett namn: "); // skriver ut ett meddelande
		
		String namn4 = input.nextLine(); // l�ser in ett namn fr�n konsolen

		System.out.println("Skriv ett namn: ");
		
		String namn5 = input.nextLine();
		
		System.out.println("\n\tNAMN:");
		System.out.println(namn1 + "\n" + namn2 + "\n" + namn3 + "\n" + namn4 + "\n" + namn5);
	}

}
