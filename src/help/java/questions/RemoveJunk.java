package questions;

public class RemoveJunk {
	// Remove special chars/Chinese/Japanese chars from a String.
	public static void main(String[] args) {
		// Regular Expression [^a-zA-Z0-9]
		String s = "@#$%@# latin string $34534f";
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		String s1 = "@#$%@# latin string $3453 Selenium #$^%#^%$4f";
		s1 = s1.replaceAll("[^a-zA-Z0-9]", "");

	}

}
