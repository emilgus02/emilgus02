import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuffer ordet = new StringBuffer(input.nextLine());
		
		if (String.valueOf(ordet).contains(" ") == false) {
			System.out.println("Fel");
		} else {
			System.out.println("Rätt");
		}
		
	}
}