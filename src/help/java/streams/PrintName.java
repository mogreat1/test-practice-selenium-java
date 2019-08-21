package streams;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintName {

    @Test
    public void regular(){
        List<String> names = new ArrayList<>();
        names.add("Abb");
        names.add("Don");
        names.add("Aleks");
        names.add("Adam");
        names.add("Ram");
        int count =0;

        for (int i=0; i<names.size(); i++){
            String actrual = names.get(i);
            if(actrual.startsWith("A")){
                count ++;
            }
        }
        System.out.println(count);
    }

    @Test
    public void streamFilter(){
        List<String> names = new ArrayList<>();
        names.add("Abb");
        names.add("Don");
        names.add("Alexa");
        names.add("Adam");
        names.add("Ramdd");
        Long  c = names.stream().filter(s->s.startsWith("A")).count();
        System.out.println(c);

        //return all names which start from A char
        long d = Stream.of("Asdf", "Don", "Alex", "Aaaa", "Ram").filter(b->
        {
            return b.startsWith("A");
        }).count();
        System.out.println(d);
        //Print all names of ArrayList with length greater then 4
         names.stream().filter(a->a.length()>4).forEach(a-> System.out.println(a));
        //Print only one name with length greater then 4
         names.stream().filter(s -> s.length()>4).limit(1).forEach(s -> System.out.println(s));
    }

    @Test
    public void streamMap(){
        //print names which have last letter 'a' with Uppercase
        Stream.of("Asdf", "Don", "Alex", "Aaaa", "Rama").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase()).
                forEach(s -> System.out.println(s));
        //print names which have first letter as a with uppercase and sorted
        List<String> names = Arrays.asList("Asdf", "Don", "Alex", "Aaaa", "Rama");
        names.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
    }

    @Test
    public void mergeLists(){
        List<String> names = new ArrayList<>();
        names.add("man");
        names.add("Don");
        names.add("woman");
        List<String> names1 = Arrays.asList("Asdf", "Don", "Alex", "Aaaa", "Rama");

       Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
       newStream.sorted().forEach(s -> System.out.println(s));
    }

    @Test
    public void matchList(){
        //match if name contains is present in the list
        List<String> names = new ArrayList<>();
        names.add("man");
        names.add("Don");
        names.add("woman");
        boolean res =names.stream().anyMatch(s -> s.equalsIgnoreCase("man"));
        Assert.assertTrue(res);
    }

    @Test
    public void collectStream(){
        List<String> ls =Stream.of("Asdf", "Don", "Alex", "Aaaa", "Rama").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase()).
                collect(Collectors.toList());
        ls.stream().forEach(s -> System.out.println(s));
    }

    @Test
    public void collectArray(){
        List<Integer> values =  Arrays.asList(2, 2, 3, 5 ,7 ,1, 9, 7);
        //print unique numbers
        values.stream().distinct().forEach(s-> System.out.println(s));
        //sort the array and print the third result
       List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(li.get(2));

    }


}
