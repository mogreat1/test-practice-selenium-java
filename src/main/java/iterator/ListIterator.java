package iterator;

import java.util.List;

public class ListIterator {

    public static void main(String[] args) {
        List<String> stringList = List.of("one", "two");
        for (String s : stringList) {
            System.out.println(s);
        }
    }
}
