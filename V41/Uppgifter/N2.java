package Uppgifter;

import java.util.Scanner;

public class N2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		int num = input.nextInt();
		int sum = 0;
		
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println(sum);			
		input.close();

	}

}
