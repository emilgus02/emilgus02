package kattis;

import java.util.Scanner;

public class spavanac {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int timmar = input.nextInt();
		int minuter = input.nextInt();
		
		if (0 <= minuter && minuter < 45) {// kollar om minuter är större än 0 och mindre än 45 för annars så kommer den gå till else 
			timmar -= 1;
			minuter += 60;
			minuter -= 45;
		}
		
		else {
			minuter -= 45; // om talet inte är större än 45 så ska man inte ta minus en timme bara minus 45 minuter
		}
		if (timmar < 0) {// för att timmar inte ska bli ett negativt tal så kollar den om timmar är mindre än 0 så blir det 23 istället
			timmar = 23;
		}
		
		System.out.println(timmar + " " + minuter );
		
	}

}
