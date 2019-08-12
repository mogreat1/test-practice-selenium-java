package questions;

public class ReverseInteger {

	public static void main(String[] args) {
		// 1 method
		long num = 43412345;
		long rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;

		}

		System.out.println(rev);

		// 2 Method

		System.out.println(new StringBuffer(String.valueOf(rev)).reverse());

	}

}
