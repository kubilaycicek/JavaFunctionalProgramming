package functionalinterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = incrementByOne(1);
        System.out.println(increment);


        Integer increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        Integer multiply = multipleBy10Function.apply(3);
        System.out.println(multiply);

        System.out.println(addBy1AndThenMultiplyBy10.apply(4));

    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multipleBy10Function = number -> number * 10;

    static Function<Integer, Integer> addBy1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multipleBy10Function);

    static int incrementByOne(int number) {
        return number + 1;
    }

}
