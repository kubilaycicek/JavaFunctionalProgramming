package streams;

import imperative.Main;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {

        Person.getPeople().stream()
                .map(person -> person.getGender())
                .collect(Collectors.toSet())
                .forEach(System.out::println);


        Person.getPeople().stream()
                .map(person -> person.getName())
                .mapToInt(String::length)
                .forEach(System.out::println);

        Boolean containsOnlyFemales = Person.getPeople().stream()
                .allMatch(person -> person.getGender().equals(Gender.FEMALE));
        System.out.println(containsOnlyFemales);


        Function<String, String> toUpperName = (String name) -> name.toUpperCase();

        List<Person> personList = Person.getPeople().stream()
                .map(item -> new Person(toUpperName.apply(item.getName()), item.getGender())).collect(Collectors.toList());
    }

    enum Gender {
        MALE, FEMALE
    }
}
