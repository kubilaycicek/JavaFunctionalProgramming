package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Object value = Optional.ofNullable(null)
                .orElseGet(() -> "default value");

        System.out.println(value);


        Object value1 = Optional.ofNullable(null)
                .orElseGet(() -> new IllegalAccessException("exception"));


        Optional.ofNullable("Hello")
                .ifPresent(text -> System.out.println(text.toUpperCase()));

        Optional.ofNullable("Kubilay")
                .ifPresent(System.out::println);
    }
}
