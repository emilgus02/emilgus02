package V37;

import java.util.Scanner;

public class l�xa1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Vad heter du?");
		String Namn = input.nextLine();
		
		System.out.println("Hur gammal �r du?");
		String �lder = input.nextLine();
		
		System.out.println("Vad �r din adress?");
		String Adress = input.nextLine();
		
		System.out.println("Vad �r ditt postnummer?");
		String Postnummer = input.nextLine();
		
		System.out.println("Vilken stad bor du i?");
		String Stad = input.nextLine();
		
		System.out.println("Vad �r ditt telefonnummer?");
		String Mobilnummer = input.nextLine();
		
		System.out.println( "Information:" + "\n" + "Namn:" +"\t" + Namn + "\n" + "�lder:" + "\t" + �lder + "\n" + "Adress:" + "\t" + Adress + "\n" + "\t" + Postnummer + " " + Stad +"\n" + "Nummer:" + "\t" + Mobilnummer);
		
	}
 
}