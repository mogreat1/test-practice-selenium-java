package streams;


import org.testng.Assert;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice {

    public static void main(String[] args) {

        String array[] = {"Ann", "Ban", "Arara", "Lol", "Karl"};
        String array2[] = {"Ana", "Ben", "Arara", "Agg", "Lark"};

        List<Man> men = Arrays.asList(
                new Man("Tom", 26),
                new Man("Karl", 52),
                new Man("Barmar", 18));

        String collect = men.stream()
                .filter(man -> man.getAge() >= 18)
                .map(man -> man.getName())
                .collect(Collectors.joining(" and "));

       // System.out.println(collect);


    }
}
