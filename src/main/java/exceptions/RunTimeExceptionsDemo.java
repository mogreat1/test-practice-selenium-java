package exceptions;

public class RunTimeExceptionsDemo {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int c;
		try {
			c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		int[] nymbers = { 1, 2, 3 };
		try {
			for (int i = 0; i <= 3; i++) {
				System.out.println(nymbers[i]);
			}
		} catch (Exception e) {
			
			System.out.println("There is no index after two");
			System.out.println(e.getMessage());
		}

	}

}
