package functionalinterface;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

        Customer maria = new Customer("Maria", "9999");

        // Normal Java Function
        greetCustomer(maria);

        // Functional Interface
        greetCustomerConsumer.accept(maria);

    }

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.getCustomerName() +
                    ", thanks for registering phone number "
                    + customer.getCustomerPhoneNumber());

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.getCustomerName() +
                ", thanks for registering phone number "
                + customer.getCustomerPhoneNumber());
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }

        public String getCustomerName() {
            return customerName;
        }

        public String getCustomerPhoneNumber() {
            return customerPhoneNumber;
        }
    }
}
