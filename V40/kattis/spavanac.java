package kattis;

import java.util.Scanner;

public class spavanac {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int timmar = input.nextInt();
		int minuter = input.nextInt();
		
		if (0 <= minuter && minuter < 45) {// kollar om minuter �r st�rre �n 0 och mindre �n 45 f�r annars s� kommer den g� till else 
			timmar -= 1;
			minuter += 60;
			minuter -= 45;
		}
		
		else {
			minuter -= 45; // om talet inte �r st�rre �n 45 s� ska man inte ta minus en timme bara minus 45 minuter
		}
		if (timmar < 0) {// f�r att timmar inte ska bli ett negativt tal s� kollar den om timmar �r mindre �n 0 s� blir det 23 ist�llet
			timmar = 23;
		}
		
		System.out.println(timmar + " " + minuter );
		
	}

}
