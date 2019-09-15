package V37;

import java.util.Scanner;

public class lektion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		
		String namn1 = "Tomas Weis";
		String namn2 = "Emil Gustafsson";
		String namn3 = "Linus Lindström";
		
		System.out.println("Skriv ett namn");
		
		String namn4 = input.nextLine();
		
		System.out.println("Skriv ett namn");
		
		String namn5 = input.nextLine();
		
		System.out.println("\nNAMN");
		System.out.println(namn1 + "\n" + namn2 + "\n" + namn3 + "\n" + namn4+ "\n" + namn5);
	}
}