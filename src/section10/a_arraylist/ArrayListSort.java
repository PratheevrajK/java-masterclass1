package section10.a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<String> groceries = new ArrayList<>();
        groceries.addAll(Arrays.asList("orange", "mango", "beetroot"));
        groceries.addAll(List.of("apple", "banana", "carrot"));
        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        //Converting ArrayList to Array
        String[] groceryArr = groceries.toArray(new String[0]); //(new String[groceries.size()]) also works.
        System.out.println("groceryArr is:" + Arrays.toString(groceryArr));
    }
}
