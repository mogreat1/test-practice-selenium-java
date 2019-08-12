package introduction;
import java.util.*;

public class ArraysDemo {
	public static void main(String[] args) {
		int [] myIntArray1 = {100, 90};

		System.out.println(myIntArray1[0]);
		System.out.println(myIntArray1[1]);
		//System.out.println(myIntArray1[2]);
		
		String [] myStringArray = {"bmw", "audi", "honda"};
		System.out.println(myStringArray[0]);
		System.out.println(myStringArray[1]);
		System.out.println(myStringArray[2]);
		
		int len1 = myIntArray1.length;
		int len2 = myStringArray.length;
		System.out.println(len1);
		System.out.println(len2);
		
		for(int i = 0; i<len1; i++) {
			System.out.println(myIntArray1[i]);
		}
		
		Arrays.sort(myIntArray1);
		
		for(int i = 0; i<len1; i++) {
			System.out.println(myIntArray1[i]);
		}

	}

}
