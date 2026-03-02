package section14.b_functional_interface_categories;

import java.util.ArrayList;
import java.util.List;

public class D_PredicateExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of(
                "alpha",
                "beta",
                "gamma",
                "delta"
        ));
        list.addAll(List.of("blue", "green"));

        list.removeIf(item -> item.startsWith("b")); //Predicate example
        list.forEach(item -> System.out.println(item));
        //alpha
        //gamma
        //delta
        //green
    }
}
