package lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {
        Function<String, String> upperCaseName = name -> name.toUpperCase();

        System.out.println(upperCaseName.apply("kubilay"));


        Function<String, String> lowerCaseName = name -> {
            if (name.isEmpty()) throw new IllegalArgumentException("");
            return name.toLowerCase();
        };

        System.out.println(lowerCaseName.apply("KUBİLAY"));

        BiFunction<String, Integer, String> upperCase2 = (name, age) -> {
            if (name.isEmpty()) throw new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase();
        };

        System.out.println(upperCase2.apply("kubilay",27));

    }
}
