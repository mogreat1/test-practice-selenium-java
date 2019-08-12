package introduction;

public class ForDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		int[] numbers = {10, 20,30};
		for( int i = 0; i < numbers.length; i ++) {
			System.out.println(numbers[i]);
		}
		int[] numbers1 = {101, 201,301};
		for(int number: numbers1) {
			System.out.println(number);
		}

	}

}
