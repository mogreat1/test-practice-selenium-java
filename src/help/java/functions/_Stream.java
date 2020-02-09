package functions;

import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static functions._Stream.Gender.*;

public class _Stream {

    List<Person> people = List.of(
            new Person("John", MALE),
            new Person("Maria", FEMALE),
            new Person("Aisha", FEMALE),
            new Person("Alexandra", MALE),
            new Person("Alice", MALE)
    );

    @Test
    void test1(){
        people.stream()
                .map(person -> person.name)
                .mapToInt(name->name.length())
                .forEach(System.out :: println);
    }

    @Test
    void test2(){
        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out :: println);
    }

    @Test
    void test3(){
        boolean b = people.stream()
                .anyMatch(person -> person.gender.equals(FEMALE));
        System.out.println(b);

        boolean c = people.stream()
                .allMatch(person -> person.gender.equals(FEMALE));
        System.out.println(c);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }


}
