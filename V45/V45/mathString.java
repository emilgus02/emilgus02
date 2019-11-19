package V45;

import java.util.Scanner;

public class mathString {

	public static void main(String[] args) {
		
		double svar = Math.sqrt((Math.pow(3, 2) + 4));
		
		System.out.println(svar);
		
		Math.max(3,7);
		
		String mening = "Petter got the smallest purple dick in the world and green balls!";
		System.out.println(mening);
		
/*		Scanner input = new Scanner(System.in);
		
		String mening2 = input.nextLine();
		
		if (mening.equals(mening2)) {
			System.out.println("samma mening");
		}
		*/
		
		System.out.println(mening.length());
		System.out.println(mening.toUpperCase());
		System.out.println(mening.toLowerCase());
		System.out.println(mening.contains("Petter"));
		System.out.println(mening.trim());
		System.out.println(mening.trim().toLowerCase());
		System.out.println(mening.replace('P', 'B'));
		
		int a = 7;
		int b = 3;
		
		double answer = (double)a / (double)b;
		
		System.out.println(answer);
		
		

	}

}
