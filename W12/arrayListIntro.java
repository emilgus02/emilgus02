
import java.util.ArrayList;
import java.util.Scanner;

public class arrayListIntro {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		ArrayList<String> nameList = new ArrayList<String>();

		nameList.add("Tomas"); // På index 0
		nameList.add("Petter"); // På index 1
		nameList.add(1, "Tomas"); // På index 1 och Petter hamnar på index 2

		for (int i = 0; i < nameList.size(); i++) { // Skriver ut ArrayList innehållet med .size() + .get()
			System.out.println(nameList.get(i));

		}
		System.out.println();

		nameList.remove("Tomas");

		for (int i = 0; i < nameList.size(); i++) { // Skriver ut ArrayList innehållet med .size() + .get()
			System.out.println(nameList.get(i));

		}
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for (int i = 0; i < 100; i++) {
			numbers.add(i*i);
		}
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		System.out.println(numbers);
	}

}
