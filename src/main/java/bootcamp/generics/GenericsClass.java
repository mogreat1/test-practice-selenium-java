package bootcamp.generics;




public class GenericsClass {

    public static void main(String[] args) {

        GenericsBox<Phone> box = new GenericsBox<>();
        box.setT(new Phone("Samsung"));

        System.out.println(box.getT());

        GenericsBox<Letter> box2 = new GenericsBox<>();
        box2.setT(new Letter("Max"));

        System.out.println(box2.getT());
    }
}
