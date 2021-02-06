package functionalinterface;

import java.util.function.BiConsumer;

public class _BiConsumer {

    public static void main(String[] args) {

        Customer maria = new Customer("Maria ", "9999");

        // Functional Interface
        greetCustomerBiConsumer.accept(maria, true);
        greetCustomerBiConsumer.accept(maria, false);

        //Normal Java Function
        greetCustomer(maria,true);

    }

    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.getCustomerName() +
                    ", thanks for registering phone number "
                    + (showPhoneNumber ? customer.getCustomerPhoneNumber() : "********"));

    static void greetCustomer(Customer customer, boolean showPhoneNumber) {
        System.out.println("Hello " + customer.getCustomerName() +
                ", thanks for registering phone number "
                + (showPhoneNumber ? customer.getCustomerPhoneNumber() : "********"));
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


