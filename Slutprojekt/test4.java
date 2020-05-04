import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String namn = "Lektion";

		for (int i = 0; i < namn.length(); i++) {

			System.out.println(namn);

			String gissning = input.nextLine();

			if (namn.contains(gissning)) {
				char[] namnC = namn.toCharArray();
				char[] gissningC = gissning.toCharArray();

				for (int j = 0; j < namn.length(); j++) {
					if (namnC[j] == gissningC[p]) {
						System.out.println(gissningC[p]);
					}
					else {
						System.out.println("fel");
					}
				}
			} else {
				System.out.println("Häng Gubbe");
			}

		}

	}

}
