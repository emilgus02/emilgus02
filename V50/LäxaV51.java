
import java.util.Scanner;

public class LäxaV51 {

	public static void main(String[] args) {

		// Switch - case är användbart när man har ett bestämt antal fall som kan hända,
		// t ex en meny för användare

		Scanner input = new Scanner(System.in);
		boolean stop = true;
		while (stop) {
			System.out.println("Välkommen till Emils fantastiska artister och låtar");
			System.out.println("(1) - Pelle Karlsson");
			System.out.println("(2) - Roland Utbult");
			System.out.println("(3) - Bethel Music");
			System.out.println("(4) - Ed Sheeran");
			System.out.println("(5) - Quit");
			System.out.println();

			int choice = input.nextInt();

			String genre;

			switch (choice) {
			case 1:
				genre = "Pelle Karlsson";
				System.out.println("Du valde " + genre + "! Välj nu en bra låt!");
				System.out.println();
				System.out.println("1. Han är min sång och min glädje");
				System.out.println("2. När du går över floden");
				System.out.println("3. Det lilla ljus");
				System.out.println("4. Return to menu");
				System.out.println();

				int val = input.nextInt();

				if (val == 4) {
					stop = true;
				} else {
					stop = false;
				}
				break;
			case 2:
				genre = "Roland Utbult";
				System.out.println("Du valde " + genre + "! Välj nu en bra låt!");
				System.out.println();
				System.out.println("1. Då ska glädjen bryta fram");
				System.out.println("2. En sång inom mig");
				System.out.println("3. KD-låten");
				System.out.println("4. Return to menu");
				System.out.println();
				int valde = input.nextInt();

				if (valde == 4) {
					stop = true;
				} else {
					stop = false;
				}
				break;
			case 3:
				genre = "Bethel Music";
				System.out.println("Du valde " + genre + "! Välj nu en bra låt!");
				System.out.println();
				System.out.println("1. Raise a Hallelujah");
				System.out.println("2. King of My Heart");
				System.out.println("3. No Longer Slaves");
				System.out.println("4. Return to menu");
				System.out.println();
				int V = input.nextInt();
				if (V == 4) {
					stop = true;
				} else {
					stop = false;
				}
				break;
			case 4:
				genre = "Ed Sheeren";
				System.out.println("Du valde " + genre + "! Välj nu en bra låt!");
				System.out.println();
				System.out.println("1. Photograph");
				System.out.println("2. Castle on the Hill");
				System.out.println("3. Happier");
				System.out.println("4. Return to menu");
				System.out.println();
				int VA = input.nextInt();
				if (VA == 4) {
					stop = true;
				} else {
					stop = false;
				}
				break;
			case 5:
				System.out.println("Tack för idag!");
				break;
			default:
				genre = "invalid";
				System.out.println("Du har valt ett " + genre + " Val! Testa en annan siffra!");
				System.out.println();
				break;
			}
		}
	}

}
