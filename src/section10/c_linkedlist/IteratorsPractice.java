package section10.c_linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IteratorsPractice {
    public static void main(String[] args) {
        LinkedList<String> countries = new LinkedList<>(List.of("India", "China", "SriLanka", "Pakistan"));

        usingIterator(countries);

        usingListIterator(countries);
    }
    public static void usingIterator(LinkedList<String> list) {
        var countries = list.iterator(); // only forward traversing is supported.
        while(countries.hasNext()) {
            if(countries.next().equals("China")) {
                countries.remove(); // This is the only method in Iterator that updates the list.
            }
        }
        System.out.println(list);
    }
    public static void usingListIterator(LinkedList<String> list) {
        // With listIterator both forward and reverse traversal is possible.
        // Forward traversal
        ListIterator<String> countries = list.listIterator();
        while(countries.hasNext()) {
            if(countries.next().equals("SriLanka")) {
                countries.add("Malaysia"); // Element Malaysia would be added next to China.
            }
        }
        System.out.println(list);
        // Reverse traversal
        while(countries.hasPrevious()) {
            System.out.println(countries.previous());
        }
    }

}
