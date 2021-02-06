package streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class _Stream02 {

    public static void main(String[] args) {

        // Imperative approach

        /*
        List<Person> females = new ArrayList<>();
        for (Person person : Person.getPeople()) {
            if (person.gender.equals(Gender.FEMALE)) {
                females.add(person);
            }
        }

        females.forEach(System.out::println);
        */

        // Declarative approach

        //Filter
        List<Person> females = Person.getPeople().stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());

//        females.forEach(System.out::println);

        //Sort
        List<Person> sorted = Person.getPeople().stream()
                .sorted(Comparator.comparing(Person::getAge)
                        .thenComparing(Person::getGender))
                .collect(Collectors.toList());
//        sorted.forEach(System.out::println);

        //All Match
        boolean allMatch = Person.getPeople().stream()
                .allMatch(person -> person.getAge() > 30);

//        System.out.println(allMatch);

        boolean anyMatch = Person.getPeople().stream()
                .anyMatch(person -> person.getAge() > 30);

//      System.out.println(anyMatch);

        boolean noneMatch = Person.getPeople().stream()
                .noneMatch(person -> person.getName().equals("Antonio"));
//      System.out.println(noneMatch);

        // Max
        Person.getPeople().stream()
                .max(Comparator.comparing(Person::getAge));
//              .ifPresent(System.out::println);

        // Min
        Person.getPeople().stream()
                .min(Comparator.comparing(Person::getAge));
//              .ifPresent(System.out::println);

        // Group
//        Person.getPeople().stream().collect(Collectors.groupingBy(Person::getGender))
//                .forEach((gender,people1)->{
//                    System.out.println(gender);
//                    people1.forEach(System.out::println);
//                    System.out.println();
//                });

        Person.getPeople().stream()
                .filter(person->person.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName).ifPresent(System.out::println);
    }
}
