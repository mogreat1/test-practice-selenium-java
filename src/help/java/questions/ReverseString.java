package questions;

public class ReverseString {

	// Reverse a String
	// Difference between String and StringBuffer
	// Do we have reverse function in String?
	static String s = "Selenium";

	public static void main(String[] args) {

		reverseStringMethod1(s);
		reverseStringMethod2(s);

		String[] values = {"Racecar", "Was it a cat I saw", "dad", "New string"};
		verifyIfStringPolindrom(values);

	}

	public static void reverseStringMethod1(String input) {
		int length = s.length();
		String rev = "";

		for (int i = length - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
	}

	public static void reverseStringMethod2(String input) {

		StringBuffer sf = new StringBuffer(input);
		System.out.println(sf.reverse());

	}

	public static void verifyIfStringPolindrom(String[] values) {
		//TODO: Verify if strings from the array are Polindrom or not
		for (String value : values) {
			String reverse = "";
			for (int x = value.length() - 1; x >= 0; x--) {
				reverse = reverse + value.charAt(x);

			}

			if (value.equalsIgnoreCase(reverse)) {
				System.out.println(value + " - This string is Polindrom");
			} else {
				System.out.println(value + " - This string is not Polindrom");
			}

		}

	}


}
