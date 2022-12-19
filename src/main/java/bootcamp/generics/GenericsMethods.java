package bootcamp.generics;

public class GenericsMethods {

    public static void main(String[] args) {
        String[] names = {"Ali", "Jamila"};
        Character[] letters = {'a', 'b', 'c'};
        Integer[] integers = {1, 2, 3};

        print(names);
        print(letters);
        print(integers);
    }

    static <T> void print(T[] array) {
        for (T e : array) {
            System.out.println(
                    e.getClass().getName() + " - " + e
            );
        }
    }
}
