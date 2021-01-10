package functions.practice;

import java.time.LocalDate;

import static functions.practice.CustomerRegistrationValidator.*;


public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer(
                "Alica",
                "alica@gmail.com",
                "+02423423",
                LocalDate.of(2010, 1, 1)
        );

//        CustomerValidationService service = new CustomerValidationService();
//        System.out.println(service.isValid(customer));

        ValidationResult result = CustomerRegistrationValidator
                .isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);

        System.out.println(result);

        if(result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }

    }

}
