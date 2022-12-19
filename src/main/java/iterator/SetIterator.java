package iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetIterator {

    public static void main(String[] args) {

        List<String> strings = List.of("one", "two", "one");

        Set<String> set = new HashSet();
        set.addAll(strings);

        for (String s : set) {
            System.out.println(s);
        }
    }
}
