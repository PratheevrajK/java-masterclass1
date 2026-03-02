package section14.a_lambda_basics;

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

//        //Using anonymous class
//        var peopleComparator = new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.lastName.compareTo(o2.lastName);
//            }
//        };
//
//        people.sort(peopleComparator);

        // above anonymous class can be written as a Lambda function, as Comparator is a Functional Interface.
//        people.sort((o1, o2) -> o1.lastName.compareTo(o2.lastName));
//        System.out.println(people);
//        [Vishnu Kumar, Nirmal Kumar, Pratheev Raj, Sharan Raj, Barani Raj]

        // local nested type
        interface MixedComparator <T> extends Comparator<T> {
            int compareFirstName(T o1, T o2);
        }

        //Using anonymous class
        var mixedComparator = new MixedComparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.lastName.compareTo(o2.lastName);
                return (result == 0 ? compareFirstName(o1, o2) : result);
            }

            @Override
            public int compareFirstName(Person o1, Person o2) {
                return o1.firstName.compareTo(o2.firstName);
            }
        };

        people.sort(mixedComparator);
        System.out.println(people);
//        [Nirmal Kumar, Vishnu Kumar, Barani Raj, Pratheev Raj, Sharan Raj]

        //MixedComparator interface cannot be converted to Lambda expression because it is not a Functional Interface(as it has more than one default method including parent class one).

    }





}
