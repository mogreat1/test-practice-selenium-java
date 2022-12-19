package bootcamp.datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class TheQueue {

    public static void main(String[] args) {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Karl", 22));
        supermarket.add(new Person("Afa", 34));
        supermarket.add(new Person("Ali", 12));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
    }

    private record Person(String name, int age) {
    }
}
