package questions;

import java.util.Arrays;

public class LargestSmollestNumberInArray {

	public static void main(String[] args) {

		int numbers[] = { -10, 23, 43, -43, 43434, 5555 };

		int largest = numbers[0];
		int smollest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {

			if (numbers[i] > largest) {
				largest = numbers[i];
			} else if (numbers[i] < smollest) {
				smollest = numbers[i];
			}

		}
		System.out.println(Arrays.toString(numbers));
		System.out.println(largest);
		System.err.println(smollest);

	}

}
