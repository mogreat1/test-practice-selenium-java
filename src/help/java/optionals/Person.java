package optionals;

import java.util.Optional;

public class Person {

    private String name;
    private int age;
    public enum Gender {
        MALE,
        FEMALE
    }

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
