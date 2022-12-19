package functionalinterface;

import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        Function<Integer, Integer> addByOneAndThenMultiplyByTen
                = incrementByOneFunction.andThen(multiplyByTenFunction);

        System.out.println(addByOneAndThenMultiplyByTen.apply(4));
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    static Function<Integer, Integer> multiplyByTenFunction = number -> number * 10;

}
