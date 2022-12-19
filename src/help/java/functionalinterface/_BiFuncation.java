package functionalinterface;

import java.util.function.BiFunction;

public class _BiFuncation {

    public static void main(String[] args) {
        System.out.println(incrementByOneAndMultiply.apply(1, 10));
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiply
            = (numberToIncrement, numberToMultiply)
            -> (numberToIncrement + 1) * numberToMultiply;
}
