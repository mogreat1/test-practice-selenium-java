package streams;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsTutorial {

    @Test
    private void test1(){
        //1.Integer Stream
        IntStream
                .range(1, 10)
                .skip(5)
                .forEach(x-> System.out.println(x));
        System.out.println();
    }

    @Test
    private void test2(){
        //1.Integer Stream with sum
        System.out.println(
        IntStream
                .range(1, 5)
                .sum()
        );
    }

    @Test
    private void test3(){
        Stream.of("Ava", "Aneri", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

    }

    @Test
    private void test4(){
        String [] names = {"Al", "Ankit", "Kushal", "Sarika", "Solomon"};
        Arrays.stream(names)
        .filter(s -> s.startsWith("S"))
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    private void test5(){
        int [] names = {2,4,5,6,10};
        Arrays.stream(names)
                .map(operand -> operand*operand)
                .average()
                .ifPresent(System.out::println);
    }




}
