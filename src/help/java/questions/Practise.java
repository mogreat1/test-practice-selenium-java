package questions;


import org.testng.annotations.Test;

import java.util.*;

public class Practise {

    public static void main(String[] args) {
        String one = "string";
        String two = "string";
        System.out.println(one ==two);
    }

    String names[] = {"one", "two", "three", "one", "four", "five", "five"}; // Duplicate elements
    int numbers[] = {1, 2, 4, 5, 6, 7, 8}; // 1. largest/ smallest number 2. missing number
    List<String> src = List.of("Java", "Java", "Python", "Kotlin", "Java");//find first element
    String s = "@#$%@# latin string $34534f"; // remove junk
    int x = 5; // swap values without third variable
    int y = 10;
    int num = 1234; // reverse number
    String string = "madas"; // string can be read the same from both sides
    String str = "Selenium this is not Rest Assured"; // reverse string
    // 1.Print minimal number of the array
    // 2.Find max number in the column with min value of matrix
    int b[][] = {{-1, 6, 1, 4, 7}, {4, -2, -7, 88, 0}, {9, -3, 23, -31, 55}};
    // Print unique number from the array OR Print True if sum of any two values equals to value
    int array[] = {4, 5, 5, 5, 4, 6, 6, 9, 4, 88, 9, 4, 5, 66};
    int value = 75;
    int num1[] = {1, 3, 5, 7, 9}; // compare two arrays have the same values
    int num2[] = {5, 1, 3, 9, 7, 66, 43};//find value which doesn't exist in both arrays
    int num3[] = {1, 3, 5, 7, 9};
    //Write a function which will return index and and value of each first
    // repeated character in the string. Ex “assddd” -> 0,a; 1,s; 3, d
    String values = "assddda";
    //Print Buzz for numbers which can be divided by 5, Fizz for those can be divided by 3, FizzBuzz by both
    ArrayList<String> list = new ArrayList<>(); //combine Strings but using Streams
    // list.add("one");
    // list.add("two");

    @Test
    public void test() {


    }
}



