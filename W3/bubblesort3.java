import java.util.Arrays;
import java.util.Scanner;

public class bubblesort3 {

	public static void main(String[] args) {

		BS();

	}

	private static void BS() {
		Scanner input = new Scanner(System.in);

		int[] numbers = new int[input.nextInt()];
		int temp = 0;
		int mellan = input.nextInt();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * mellan);
		}
		System.out.println(Bubble(numbers, temp));
	}

	/**
	 * 
	 * @param numbers
	 * @param temp
	 * @return
	 */
	private static String Bubble(int[] numbers, int temp) {
		boolean swapped = false;
		do {

			swapped = false;
			for (int i = 0; i < numbers.length - 1; i++) {
				if (numbers[i] > numbers[i + 1]) {
					temp = numbers[i];
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = temp;
					swapped = true;

				}
			}
		} while (swapped);

		return Arrays.toString(numbers);
	}

}
