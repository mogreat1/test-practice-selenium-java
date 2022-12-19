package bootcamp.generics;

import java.util.Arrays;
import java.util.List;

public class Wildcards {

    public static void main(String[] args) {
        List<Object> list1 = Arrays.asList(1, 2);
        List<Integer> list2 = Arrays.asList(1, 2);
        List<Double> list3 = Arrays.asList(1.2, 2.1);
        List<String> list4 = Arrays.asList("1", "2");

        //everything
        unboundedWildCard(list1);
        unboundedWildCard(list2);
        unboundedWildCard(list3);
        unboundedWildCard(list4);

        //only numbers
        upperBoundedWildCard(list2);
        upperBoundedWildCard(list3);

        //only object and int
        lowerBoundedWildCard(list1);
        lowerBoundedWildCard(list2);
    }

    static void unboundedWildCard(List<?> list) {
        list.forEach(System.out::println);
    }

    static void upperBoundedWildCard(List<? extends Number> list) {
        list.forEach(System.out::println);
    }

    static void lowerBoundedWildCard(List<? super Integer> list) {
        list.forEach(System.out::println);
    }
}
