package section14.z_enhanced_sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

record Person (String firstName, String lastName) {
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(List.of(
                new Person("Pratheev", "Raj"),
                new Person("Sharan", "Raj"),
                new Person("Vishnu", "Kumar"),
                new Person("Arun", "Kumar"),
                new Person("Arun", "Raj")
        ));
        people.sort(
                Comparator.comparing(Person::lastName)
                        .thenComparing(Person::firstName)
                        .reversed()
        );
        System.out.println(people);
        //[Sharan Raj, Pratheev Raj, Arun Raj, Vishnu Kumar, Arun Kumar]
    }
}
