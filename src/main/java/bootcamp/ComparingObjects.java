package bootcamp;

import java.util.Objects;

public class ComparingObjects {

    public static void main(String[] args) {
        Cat rose = new Cat("Rose", 2, "Blue");
        Cat rose2 = new Cat("Rose", 2, "Blue");

        System.out.println(rose == rose2);
        System.out.println(rose.equals(rose2));
    }

    private static class Cat {

        private String name;
        private int age;
        private String color;

        public Cat(String name, int age, String color) {
            this.name = name;
            this.age = age;
            this.color = color;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Cat cat = (Cat) o;
            return age == cat.age
                    && Objects.equals(name, cat.name)
                    && Objects.equals(color, cat.color);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, color);
        }
    }
}
