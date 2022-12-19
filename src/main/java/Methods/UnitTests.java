package methods;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTests {

    @Test
    public void test(){
        MethodsToTest methods = new MethodsToTest();
        int output = methods.square(5);
        Assert.assertEquals(output, 25);
    }

    @Test
    public void test2(){
        MethodsToTest methods = new MethodsToTest();
        int output =methods.countA("alphabet");
        Assert.assertEquals(output, 2);
    }
}
