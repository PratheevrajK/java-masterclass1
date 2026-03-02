package section14.b_functional_interface_categories;

import java.util.ArrayList;
import java.util.List;

public class E_FunctionExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of(
                "alpha",
                "beta",
                "gamma",
                "delta"
        ));

        list.replaceAll(s -> s.charAt(0) + "-" + s.toUpperCase()); // UnaryOperator(Accepts a param and return same type) comes under Function category(Accepts one/more param type and return different type).

        list.forEach(item -> System.out.println(item));
    }
}
