package exceptions;

import java.sql.SQLException;

public class ExceptionsDemo {

	public static void main(String[] args) {
		Account acc = new Account();
		try {
			System.out.println("1");
			acc.withdraw(100);
			System.out.println("2");
			//System.exit(0);
		} catch (Exception e) {

			//System.out.println(e.getMessage());
			System.out.println("Try again");
		}
		finally	{
			System.out.println("Allways executes");
		}

	}

}
