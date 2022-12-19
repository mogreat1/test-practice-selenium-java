package questions;

import org.junit.Test;

import java.util.*;


public class StreamsQuestions {

    @Test
    public void findPeopleAgedLess18() {
        //Find first 2 people aged less or equal 18
        List<Person> people = getPeople();

        people
                .stream()
                .filter(x -> x.getAge() >= 18)
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    public void sortPeopleDesc() {
        List<Person> people = getPeople();

        people
                .stream()
                .sorted(Comparator.comparing(Person::getAge)
                        .reversed()
                        .thenComparing(Person::getName))
                .forEach(System.out::println);
    }

    private List<Person> getPeople() {
        return List.of(
                new Person("Oleh", 12),
                new Person("Alex", 12),
                new Person("Wex", 12),
                new Person("Karl", 22),
                new Person("Ara", 43),
                new Person("Mark", 1),
                new Person("Iza", 44));;
    }

    private class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
