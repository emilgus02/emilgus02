import java.util.Scanner;

public class HittaFel {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number;
		boolean Success = false;

		System.out.println("Write a integer: ");
		

		while (!Success) {

			try {
				number = input.nextInt();
				System.out.println("The number is: " + number);
				Success = true;

			} catch (Exception e) {
				input.next();
				System.out.println("You typed the wrong input");
				System.out.println(e);
			}
		}
	}

}
