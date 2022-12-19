package functionalinterface;

import java.util.function.BiConsumer;

public class _BiConsumer {
    public static void main(String[] args) {
        Customer maria = new Customer("Maria", "999");
        greetCustomerConsumer.accept(maria, false);
    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumer = (customer, showPhoneNumber)
            -> System.out.println("Hello " + customer.customerName +
            " phone: " + (showPhoneNumber ? customer.customerPhoneNumber : "***"));


    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
