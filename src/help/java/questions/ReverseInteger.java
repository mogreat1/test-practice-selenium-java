package questions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseInteger {

    public int reverseNumbers(int num) {
        int rev = 0;
            while (num != 0) {
                rev = rev * 10 + num % 10;
                num = num / 10;
            }
            System.out.println(rev);


        return rev;
    }

    @Test
    private void happyPath() {
        int num = 1234;
        Assert.assertEquals(reverseNumbers(num), 4321);
    }

    @Test
    private void zeroValue() {
        int num = 0;
        Assert.assertEquals(reverseNumbers(num), 0);
    }

    @Test
    private void negativeValue() {
        int num = -1234;
		Assert.assertEquals(reverseNumbers(num), -4321);
    }

}
