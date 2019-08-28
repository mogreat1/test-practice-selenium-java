package streams;


import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {

    public static void main(String[] args) {

        String array[] ={"Ann", "Ban", "Arara", "Lol", "Karl"};
        String array2[] ={"Ana", "Ben", "Arara", "Agg", "Lark"};

       Stream stream = Stream.concat(Arrays.asList(array).stream(), Arrays.asList().stream());
        stream.forEach(o -> System.out.println(o));




    }
}
