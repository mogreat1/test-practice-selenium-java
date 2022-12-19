package bootcamp;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {
        System.out.println("Hello, what is your name?");
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        System.out.printf("Hello %s%n", input);

        System.out.println("What is your age?");
        int age = scanner.nextInt();
        if (age < 16) {
            System.out.println("You are a child");
        } else {
            System.out.println("Help yourself with a beer!");
        }

    }
}
