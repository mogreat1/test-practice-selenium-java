package bootcamp.generics;

public class BoundedTypeParameter {

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3};
        Double[] doubles = {1.0, 2.1, 3.1};

        System.out.println(countGreaterThan(numbers, 0));
        System.out.println(countGreaterThan(doubles, 1.0));
    }

    static <T extends Comparable<T>> int countGreaterThan(T[] numbers, T number) {
        int count = 0;
        for (T n : numbers) {
            if (n.compareTo(number) > 0) {
                count++;
            }
        }
        return count;
    }
}
