package section14.b_functional_interface_categories;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class A_ConsumerInterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of(
                "alpha",
                "beta",
                "gamma",
                "delta"
        ));

        //This is the forEach method taken from Iterable interface. forEach method accepts Consumer as a parameter.
//        default void forEach(Consumer<? super T> action) {
//            Objects.requireNonNull(action);
//            for (T t : this) {
//                action.accept(t);
//            }
//        }

//        Consumer<String> consumer = s -> System.out.println(s);
        list.forEach(s -> System.out.println(s));
        //alpha
        //beta
        //gamma
        //delta

        // use { } to enclose multiple statements.
        list.forEach((var s) -> {
            char initial = s.charAt(0);
            System.out.printf("%s means %c%n", s, initial);
        });
        //alpha means a
        //beta means b
        //gamma means g
        //delta means d

//        String prefix = "Hey ";
//        list.forEach((var s) -> {
//            char initial = s.charAt(0);
//            System.out.printf("%s %s means %c%n", prefix, s, initial); // Error: Variable `prefix` used in lambda expression should be final or effectively final.
//        });
//        prefix = "Hello";

    }
}
