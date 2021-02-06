package streams;

import java.util.Arrays;
import java.util.List;

public class Person {
    private String name;
    private Gender gender;
    private int age;

    Person(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static List<Person> getPeople() {
        return Arrays.asList(
                new Person("James Bond", Gender.MALE, 25),
                new Person("Alina Smith", Gender.FEMALE, 43),
                new Person("Helen White", Gender.FEMALE, 23),
                new Person("Alex Boz", Gender.MALE, 65),
                new Person("Jamia Goa", Gender.MALE, 45),
                new Person("Anna Cook", Gender.FEMALE, 27),
                new Person("Zelda Brown", Gender.FEMALE, 18)
        );
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
