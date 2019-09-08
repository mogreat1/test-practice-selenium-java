package questions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseString {

	// Reverse a String ignoring special characters and spaces
	// Difference between String and StringBuffer
	// Do we have reverse function in String?

	public boolean stringBuffer(String input) {
		input =input.replaceAll("[^a-zA-Z]", "");
		StringBuffer sf = new StringBuffer(input);
		return input.equalsIgnoreCase(sf.reverse().toString());
	}

	@Test
	private void StringBufferTest(){
		String testString = "- Was it a ca1t, I saw????????";
		Assert.assertTrue(stringBuffer(testString));
	}

	public boolean reverseString(String string){
		String reverse = "";
		boolean result = false;
		string =string.replaceAll("[^a-zA-Z]", "");
		if(string.length()==0){
			System.out.println("String is empty or contains only number and numbers");
		} else {
			for(int i =0; i<string.length(); i++){
				reverse = string.charAt(i) + reverse;
			}
			result =string.equalsIgnoreCase(reverse);
		}

		return result;
	}

	@Test
	private void palindromeStringTest(){
		String testString = "- Was it a ca1t, I saw????????";
		Assert.assertTrue(reverseString(testString));
	}

	@Test
	private void notPalindromeStringTest(){
		String testString = "- Was it a cat, I sasw????????";
		Assert.assertFalse(reverseString(testString));
	}

	@Test
	private void emptyStringTest(){
		String testString = "";
		Assert.assertFalse(reverseString(testString));
	}


}
