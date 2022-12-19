package questions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayQuestions {
    // 1.Return minimal number of the array
    // 2.Find max number in the column with min value of matrix

    private int minNumber(int[][] numbers) {
        int min;
        int max = 0;
        if (numbers[0].length != 0) {
            min = numbers[0][0];
            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers[0].length; j++) {
                    if (min > numbers[i][j]) {
                        min = numbers[i][j];
                        max =numbers[0][j];
                        for(int k = 0; k<numbers.length; k++){
                            if(max<numbers[k][j]){
                                max=numbers[k][j];
                            }
                        }
                    }
                }
            }
        } else {
            System.out.println("Array is empty");
            min = 0;
        }
        System.out.println(max);
        return min;
    }

    @Test
    private void minNumberTest() {
        int numbers[][] = {{-1, 6, 1, 4, 7}, {4, -2, -7, 88, 0}, {9, -3, 23, -31, 55}};
        int min = minNumber(numbers);
        Assert.assertEquals(min, -31);
    }

    @Test
    private void emptyArray() {
        int numbers[][] = {{}};
        int min = minNumber(numbers);
        Assert.assertEquals(min, 0, "Array isn't empty");
    }
}
