package section14.b_functional_interface_categories;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;

public class G_SupplierExample {
    public static void main(String[] args) {
        String[] names = {"Pratheev", "Raj", "Deepika"};
        String[] result = selectRandomValues(10, names, () -> new Random().nextInt(0,3)); // Supplier type lambda is used here.
        System.out.println(Arrays.toString(result));
        //[Deepika, Raj, Deepika, Pratheev, Raj, Raj, Pratheev, Deepika, Raj, Pratheev]
    }

    //this function will create and return a String[] with random value from values[].
    public static String[] selectRandomValues(int reqCount, String[] values, Supplier<Integer> supplier) {
        String[] result = new String[reqCount];
        for (int i = 0; i < reqCount; i++){
            result[i] = values[supplier.get()];
        }
        return result;
    }
}

