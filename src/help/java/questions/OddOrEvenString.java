package questions;

import java.util.Scanner;

public class OddOrEvenString {

    public static void main(String[] args) {

        evenOrOddNumbers(getText());
    }

    public static String getText(){
        //This method get text from a user
        //
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text");
        String text = scanner.nextLine();
        while (text.isEmpty() || text==null){
            System.out.println("Please enter your data, this field cannot be empty");
            text = scanner.nextLine();
        }
        return text;
    }

    public static void evenOrOddNumbers(String value) {
        //This method verifies if amount of characters in the text is Even or Odd
        int count = value.length();
        if (count % 2 == 0) {
            System.out.println(count + " String is Even");
        } else {
            System.out.println(count + " String is not Even");
        }


    }

}
