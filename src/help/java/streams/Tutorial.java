package streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Tutorial {

    public static void main(String[] args) {

        Arrays.asList("a1", "a2", "a3").stream().findFirst().ifPresent(System.out::println);

        IntStream.range(1, 10).forEach(System.out::println);
        Arrays.stream(new int[] {1,2,3}).map(i -> i*2 +1).average().
                ifPresent(System.out::println);

        Stream.of("a1", "a2", "a3").map(s -> s.substring(1)).
                mapToInt(Integer::parseInt).max().ifPresent(System.out::println);

    }
}
