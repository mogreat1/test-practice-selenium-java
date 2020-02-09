package functions;

import org.junit.Test;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    @Test
    public void greetCustomerConsumerTest(){
        greetCustomerConsumer.accept(new Customer("Maria", "999999"));
    }

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Thank you for using Functions: " + customer.customerName + " "
                    + customer.customerPhone);

    @Test
    public void greetCustomerBiConsumerTest(){
        greetCustomerBiConsumer.accept(new Customer("Maria", "999999"), false);
    }

    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, showPhone) ->
            System.out.println("Thank you for using Functions: " + customer.customerName + " "
                    + (showPhone ? customer.customerPhone : "******"));

    @Test
    public void greetCustomerTest(){
        greetCustomer(new Customer("Maria", "999999"));
    }

    static void greetCustomer(Customer customer) {
        System.out.println("Thank you: " + customer.customerName + " "
                + customer.customerPhone);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhone;

        Customer(String customerName, String customerPhone) {
            this.customerName = customerName;
            this.customerPhone = customerPhone;
        }
    }

}
