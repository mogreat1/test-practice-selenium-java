package questions;

public class FinalConcept {

	public static void main(String[] args) {
		// 1. constant values
		final int i = 1;
		System.out.println(i);

		// 2. to prevent method overriting
		test1();
	}

	public static void test1() {

		try {
			System.out.println("inside test1 method");
			throw new RuntimeException("test");
		} catch (Exception e) {
			System.out.println("inside catch block");
		} finally {
			System.out.println("inside finally block");
		}

	}


}
