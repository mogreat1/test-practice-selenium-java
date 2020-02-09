package functions;

import org.testng.annotations.Test;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    @Test
    private void incrementByOneTest(){
        System.out.println(incrementByONe(0));
    }
    static int incrementByONe(int number){
        return number+1;
    }

    @Test
    private void incrementByOneFunctionTest(){
        System.out.println(incrementByOneFunction.apply(1));
    }
    static Function<Integer, Integer> incrementByOneFunction =
            number -> number+1;

    @Test
    private void addByOneAndThenMultiplyBy10Test(){
        System.out.println(addByOneAndThenMultiplyBy10.apply(3));
    }
    Function<Integer, Integer> addByOneAndThenMultiplyBy10 =
            incrementByOneFunction.andThen(multiplyByTenFunction);

    @Test
    private void multiplyByTenFunctionTest(){
        System.out.println(multiplyByTenFunction.apply(2));
    }
    static Function<Integer, Integer> multiplyByTenFunction =number ->number*10;

    @Test
    private void incrementByOneAndMultiplyBiFunctionTest(){
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 10));
    }
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy)
                    ->(numberToIncrementByOne+1)*numberToMultiplyBy;
}
