package questions;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionDemo {
    // Print unique number from the list

    private int findUniqueNumber(int[] numbers) {
        int unique = 0;
        Set<Integer> set = new HashSet<Integer>();
        if (numbers.length > 1) {
            for (int i = 0; i < numbers.length - 1; i++) {
                int k = 0;
                if (set.add(numbers[i])) {
                    k++;
                    for (int j = i + 1; j < numbers.length; j++) {
                        if (numbers[i] == numbers[j]) {
                            k++;
                        }
                    }
                }
                if (k == 1) {
                    unique = numbers[i];
                }
            }
        } else if (numbers.length == 1) {
            unique = numbers[0];
        }
        System.out.println(unique);
        return unique;
    }

    private int findUniqueNumberStream(int[] numbers) {
        int unique = 0;
        numbers = Arrays.stream(numbers).sorted().toArray();



        return unique;
    }


    @Test
    private void uniqueTest2() {
        int a[] = {4, 5, 5, 5, 4, 6, 6, 9, 4};
        findUniqueNumberStream(a);
    }

    @Test
    private void uniqueTest() {
        int a[] = {4, 5, 5, 5, 4, 6, 6, 9, 4};

        Assert.assertEquals(findUniqueNumber(a), 9);
    }

    @Test
    private void emptyArray() {
        int a[] = {};
        Assert.assertEquals(findUniqueNumber(a), 0);
    }

    @Test
    private void onlyZeroTest() {
        int a[] = {7};
        Assert.assertEquals(findUniqueNumber(a), 7);
    }

}
