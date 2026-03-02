package section14.b_functional_interface_categories;

import java.util.Arrays;
import java.util.function.Function;

public class F_FunctionExample2 {
    public static void main(String[] args) {
        String name = "pratheev";

        String[] result = splitter(name, a -> a.split(""));
        System.out.println(Arrays.toString(result));
    }

    public static <T, R> R splitter(T a, Function<T, R> function) {
        return function.apply(a);
    }
}
