package introduction;

public class DefaultVariables {
	static byte myByte;
	static short myShort;
	static int myInt;
	static long myLong;
	static float myFloat;
	static double myDouble;
	static boolean myBoolean;
	static char myChar;

	public static void main(String[] args) {

		System.out.println(myByte);

		System.out.println(myShort);

		System.out.println(myInt);

		System.out.println(myLong);

		System.out.println(myFloat);

		System.out.println(myDouble);

		System.out.println(myBoolean);

		System.out.println(myChar);
		oneMoreMethod();

	}
	
	public static void oneMoreMethod() {
		System.out.println(myInt);
	}

}
