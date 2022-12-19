package streams;

import java.util.function.Consumer;

public class CallBacks {

    public static void main(String[] args) {
        helloConsumer("John", null, value -> {
            System.out.println("last name not provided for Consumer");
        });

        helloRunnable("John", null, () -> {
            System.out.println("last name not provided for Runnable");
        });
    }

    static void helloConsumer(String name, String surname, Consumer<String> callback) {
        if (surname != null) {
            System.out.println(surname);
        } else {
            callback.accept(name);
        }
    }

    static void helloRunnable(String name, String surname, Runnable callback) {
        if (surname != null) {
            System.out.println(surname);
        } else {
            callback.run();
        }
    }
}
