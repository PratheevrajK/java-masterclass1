package section10.a_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> groceries = new ArrayList<>(List.of("apple", "banana", "mango", "kiwi", "guava"));
        System.out.println(groceries);
        groceries.add("mango");
        System.out.println(groceries);
        groceries.add(1, "mango");
        System.out.println(groceries);
        groceries.set(1, "guava");
        System.out.println(groceries);
        groceries.remove("mango");
        System.out.println(groceries);
        groceries.remove(3);
        System.out.println(groceries);
        groceries.removeAll(List.of("guava", "apple"));
        System.out.println(groceries);
        groceries.clear();
        System.out.println(groceries);
        System.out.println("groceries is empty = " + groceries.isEmpty());

    }
}
