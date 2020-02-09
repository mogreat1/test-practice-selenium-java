package functions;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class _Optionals {

    @Test
    void test1(){
        Object value = Optional.ofNullable(null)
                .orElseGet(() -> "dafault value");
        System.out.println(value);
    }

    @Test
    void test2(){
        List<String> emails = new ArrayList<>();
        emails.add("asd@ead.com");
        emails.add(null);

        emails.stream().forEach(email -> Optional.ofNullable(email).ifPresentOrElse(
                email1 -> System.out.println("Sending email to: " + email1),
                ()-> System.out.println("Cannot send email")
        ));

    }

}
