package questions;

import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {

        fizzBuzzRecursion(1, getInput());

    }

    private static int getInput() {
        //This part takes boundary input from a User
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number to which you wish to do a FizzBuzz");
        int number = scanner.nextInt();
        while (number <= 0 || number > 100) {
            System.out.println("Please enter a value from 1 to 100");
            number = scanner.nextInt();
        }
        return number;
    }


    private static void fizzBuzzRecursion(int number, int boundary) {
        // The first if-else statement takes care of estimation if value is FizzBuzz
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }
        //And this part is repsonsible for increasing a number up to boundary value
        if (number == boundary) {
            return;
        } else {
            fizzBuzzRecursion(number + 1, boundary);
        }

    }

}
