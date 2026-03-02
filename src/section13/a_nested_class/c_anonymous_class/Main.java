package section13.a_nested_class.c_anonymous_class;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    // static nested record.
    record Person (String firstName, String lastName) {
        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(List.of(
                new Main.Person("Pratheev", "Raj"), // As Person record is static, can be accessed directly with ClassName.
                new Person("Sharan", "Raj"),
                new Person("Vishnu", "Kumar"),
                new Person("Nirmal", "Kumar"),
                new Person("Barani", "Raj")
        ));

        //Using anonymous class
        var peopleComparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.lastName.compareTo(o2.lastName);
            }
        };

        people.sort(peopleComparator);
        System.out.println(people);
//        [Vishnu Kumar, Nirmal Kumar, Pratheev Raj, Sharan Raj, Barani Raj]

    }

}