package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {


        System.out.println("Without Predicate");
        System.out.println(isPhoneNumberValid("05555689878"));
        System.out.println(isPhoneNumberValid("02555689878"));


        System.out.println("With Predicate");
        System.out.println(isPhoneNumberValidPredicate.test("05555689878"));

        System.out.println(
                "Is phone number valid and contains number 5 = " +
                        isPhoneNumberValidPredicate.and(containsNumber5).test("05555689878")
        );

    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("05") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("05") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber5 = phoneNumber ->
            phoneNumber.contains("5");
}
