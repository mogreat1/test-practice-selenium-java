package questions;

public class ArrayQuestions {
// 1.Print minimal number of the array
	public static void main(String[] args) {

		int b[][] = { { -1, 6, 1 }, { 4, -2, -7 }, { 9, -3, 23 } };
		int smallest = b[0][0];
		int largest = b[0][0];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (smallest > b[i][j]) {
					smallest = b[i][j];
					int minColumn = j;
					for (int f = 0; f < 3; f++) {
						if (largest < b[f][minColumn]) {
							largest = b[f][minColumn];
						}
					}

				}
			}
		}
		System.out.println(largest);
		System.out.println(smallest);

// 2.Find max number in the column with min value of matrix

	}

}
