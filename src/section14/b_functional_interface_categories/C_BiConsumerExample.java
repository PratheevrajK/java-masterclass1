package section14.b_functional_interface_categories;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class C_BiConsumerExample {
    public static void main(String[] args) {
        var coords = new ArrayList<>(List.of(
                new double[]{1.234, 5.679},
                new double[]{9.842, 3.09},
                new double[]{8.074, 1.777}
        ));
        coords.forEach(point -> System.out.println(Arrays.toString(point))); // Consumer is used internally.

        BiConsumer<Double, Double> p1 = (a, b) -> System.out.printf("Lat:%.2f, Lon:%.2f%n", a, b);
        coords.forEach(point -> processPoint(point[0], point[1], p1));

    }

    public static <T> void processPoint(T a, T b, BiConsumer<T, T> consumer) { // BiConsumer is used here.
        consumer.accept(a, b);
    }
}
