package streams;

import imperative.Main;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Jhon", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Aisha", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Alice", Gender.FEMALE)
        );

        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);


        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);


        Boolean containsOnlyFemales = people.stream()
                .allMatch(person -> person.gender.equals(Gender.FEMALE));
        System.out.println(containsOnlyFemales);


        Function<String, String> toUpperName = (String name) -> name.toUpperCase();

        List<Person> personList = people.stream()
                .map(item -> new Person(toUpperName.apply(item.name), item.gender)).collect(Collectors.toList());
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
