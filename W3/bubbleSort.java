import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] numbers = new int[input.nextInt()]; // hur m�nga tal det ska var i arryen
		boolean swapped = false;
		int temp;
		int mellan = input.nextInt();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * mellan);// slumpar och l�gger i ett tal i arrayen som �r mellan 0 och
														// 100
		}
		System.out.println(Arrays.toString(numbers));
		do {

			swapped = false; // nollst�ller swapped i b�rjan p� j�mf�r�lsen
			for (int i = 0; i < numbers.length - 1; i++) {
				if (numbers[i] > numbers[i + 1]) { // byter plats p� tv� intilliggande tal
					temp = numbers[i]; // sparar tillf�lligt v�rdet p� v�nstra sidan
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = temp;
					swapped = true;
					System.out.println(Arrays.toString(numbers));

				}
			}
		} while (swapped);
		System.out.println(Arrays.toString(numbers));
	}

}
