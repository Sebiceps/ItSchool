//Given a list of people with attributes: first name, last name, and age; use streams to find all people who are older than 18 years.
//class Person {
//    String firstName;
//    String lastName;
//    int age;
//}
//List<Person> people = Arrays.asList(new Person("Alice", "Johnson", 20), new Person("Bob", "Smith", 17));

package session17.homework.fifth_challange;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeopleAttributesUsingStreams {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Alice", "Jhonson", 20), new Person("Bob", "Smith", 17));

        List<Person> adults = people.stream()
                .filter(person -> person.getAge() > 18)
                .collect(Collectors.toList());
        System.out.println("The adults are: ");
        adults.forEach(person -> System.out.println(person.getFirstName() + " " + person.getLastName() ));
    }
}

class Person {
    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
