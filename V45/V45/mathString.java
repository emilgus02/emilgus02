package V45;

import java.util.Scanner;

public class mathString {

	public static void main(String[] args) {
		
		double svar = Math.sqrt((Math.pow(3, 2) + 4));
		
		System.out.println(svar);
		
		Math.max(3,7);
		
		String mening = "89!";
		System.out.println(mening);
	
		Scanner input = new Scanner(System.in);	

		if (mening.contains("1")||mening.contains("2")||mening.contains("3")||mening.contains("4")||mening.contains("5")||mening.contains("6")||mening.contains("7")||mening.contains("8")||mening.contains("9")) {
			System.out.println(mening);
		}

		

		
		

	}

}
