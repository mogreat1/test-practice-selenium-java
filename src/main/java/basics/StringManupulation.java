package basics;

public class StringManupulation {

	public static void main(String[] args) {

		String str = "The rain has started here";
		String str1 = "The rain has started HERE";
		String str2 = "       rain has   started   RE     ";

		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf("s"));
		System.out.println(str.indexOf("s", str.indexOf("s") + 1));
		System.out.println(str.indexOf("has"));
		System.out.println(str.indexOf("hello"));

		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.substring(4, 9));
		System.out.println(str2.trim());
		System.out.println(str2.replace("   ", " "));

		String test = " Hello_World_Test_Selenium";
		String testval[] = test.split("_");
		for (int i = 0; i < testval.length; i++) {
			System.out.println(testval[i]);
		}
		
		String x = "Hello";
		String y = "World";
		int a = 1;
		int b =2;
		
		System.out.println(x+y+a+b);
		
		
		
		
		

	}

}
