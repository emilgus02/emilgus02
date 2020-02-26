import java.util.Scanner;

public class trycatch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("skriv 1 eller 2");
		String test = input.next();

		if (test.equals("1")) {
			System.out.println("yes");
		} else if (test.equals("2")) {
			System.out.println("no");
		} else {
			System.out.println("skriv 1 eller 2");
		}
	}
}
