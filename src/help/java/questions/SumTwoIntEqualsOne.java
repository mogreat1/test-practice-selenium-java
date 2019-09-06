package questions;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class SumTwoIntEqualsOne {
    //Write a method which returns true if the sum of any two numbers
    // from the array equals to x. Write tests for it.

    private boolean sumTwoIntEqualsOney(int[] array, int x) {
        boolean result = false;

        if(array.length==0){
            System.out.println("Array is empty");
        } else if(array.length==1){
            result = array[0] == x;
        } else {

            for (int i = 0; i < array.length - 1; i++) {
                int sum = 0;
                if (result) {
                    break;
                }
                for (int j = i + 1; j < array.length; j++) {
                    sum = array[i] + array[j];
                    System.out.println(sum);
                    if (sum == x) {
                        result = true;
                        break;
                    }
                }
            }
        }
        return result;
    }

    @Test
    private void arrayContainsNumbers() {
        int x = 10;
        int[] array = {5, 9, 2, 3, 1};
        Assert.assertTrue(sumTwoIntEqualsOney(array, x));
    }

    @Test
    private void arrayDoesNotContain() {
        int x = 10;
        int[] array = {5, 2, 3, 1, 4};
        Assert.assertFalse(sumTwoIntEqualsOney(array, x));
    }

    @Test
    private void containsOnlyValidNumber() {
        int x = 10;
        int[] array = {10};
        Assert.assertTrue(sumTwoIntEqualsOney(array, x));
    }

    @Test
    private void containsOnlyInvalidNumber() {
        int x = 10;
        int[] array = {9};
        Assert.assertFalse(sumTwoIntEqualsOney(array, x));
    }

    @Test
    private void emptyArray() {
        int x = 10;
        int[] array = {};
        Assert.assertFalse(sumTwoIntEqualsOney(array, x));
    }


}
