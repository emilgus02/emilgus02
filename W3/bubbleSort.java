import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] numbers = new int[input.nextInt()]; // hur många tal det ska var i arryen
		boolean swapped = false;
		int temp;
		int mellan = input.nextInt();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * mellan);// slumpar och lägger i ett tal i arrayen som är mellan 0 och
														// 100
		}
		System.out.println(Arrays.toString(numbers));
		do {

			swapped = false; // nollställer swapped i början på jämförälsen
			for (int i = 0; i < numbers.length - 1; i++) {
				if (numbers[i] > numbers[i + 1]) { // byter plats på två intilliggande tal
					temp = numbers[i]; // sparar tillfälligt värdet på vänstra sidan
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
