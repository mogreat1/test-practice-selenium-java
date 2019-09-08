package questions;

public class SplitString {

	public static void main(String[] args) {
		String str = "This is a test string";
		String rev = "";
		
		String words[] = str.split("\\s+");
		
		
		for(String word: words) {
			rev = word +" " +  rev;
		}
		
		System.out.println(rev);
	}

}
