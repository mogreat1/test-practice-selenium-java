package combinatorpattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //good to use for validation purpose
        Customer customer = new Customer(
                "Alice",
                "emial@",
                "+000",
                LocalDate.of(2000, 1, 1)
        );

        //Using Combinator Pattern
        CustomerRegistrationValidator.ValidationResult apply = CustomerRegistrationValidator
                .isEmailValid()
                .and(CustomerRegistrationValidator.isPhoneNumberValid())
                .and(CustomerRegistrationValidator.isAdult())
                .apply(customer);

        System.out.println(apply);

    }
}
