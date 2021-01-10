package optionals;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;
import static optionals.Person.Gender.FEMALE;
import static optionals.Person.Gender.MALE;


public class Practice {

    @Test
    public void test1() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream()
                .map(String::valueOf)
                .forEach(System.out::println);

        System.out.println(numbers.stream()
                .reduce(0, Integer::sum));

        System.out.println(numbers.stream()
                .map(String::valueOf)
                .reduce("", String::concat));
    }

    @Test//double the even numbers and find their total
    public void test2() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Integer reduce = numbers.stream()
                .filter(e -> e % 2 == 0)
                .map(e -> e * 2)
                .reduce(0, Integer::sum);

        System.out.println(reduce);
    }

    @Test//
    public void test3() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5);

        numbers.stream()
                .filter(e -> e % 2 == 0)
                .map(integer -> integer * 2)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }

    @Test//
    public void test4() {
        List<Person> people = Arrays.asList(
                new Person("Piter", 12, MALE),
                new Person("Ola", 34, FEMALE),
                new Person("Karl", 44, MALE),
                new Person("Maduba", 21, FEMALE));

        System.out.println(people.stream()
                .collect(toMap(
                        person -> person.getName() + "    "+person.getAge(),
                        person -> person)
                ));

        System.out.println(people.stream()
                .collect(groupingBy(Person::getName,
                        mapping(Person::getAge, toList()))));
    }

    @Test//find the first even number greater than 3
    public void test5() {
        List<Integer> numbers =
                Arrays.asList(1, 2, 9, 3, 4, 6, 7, 5, 8);

        Optional<Integer> first = numbers.stream()
                .filter(integer -> integer % 2 == 0)
                .filter(integer -> integer >3)
                .map(integer -> integer*2)
                .findFirst();

        System.out.println(first.get());
    }
}
