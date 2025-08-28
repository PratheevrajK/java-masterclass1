package section10.c_linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CrudOperations {
    public static void main(String[] args) {
//        LinkedList<String> countries = new LinkedList<>();
        var countries = new LinkedList<String>();

        addElements(countries);
        System.out.println(countries);

        removeElements(countries);
        System.out.println(countries);

        addElements(countries);
        System.out.println(countries);

        fetchElements(countries);

        countries.removeAll(List.of("India", "China", "America", "Europe", "France"));
        System.out.println(countries);

        printItinerary1(countries);
        printItinerary2(countries);
        printItinerary3(countries);
    }
    public static void addElements(LinkedList<String> list) {
        list.add("America"); // adds element to the beginning of the list
        list.add(1, "Europe"); // adds element to the mentioned index
        list.addFirst("Dubai"); // adds element to the beginning of the list
        list.addLast("India"); // adds element to the end of the list
        System.out.println(list);
        // Stack methods
        list.push("China"); // adds element to the top/beginning of the list.
        list.push("India");
        list.push("France");
        // Queue methods
        list.offer("Japan"); // adds element to the end of the list.
        list.offerLast("Zimbabwe"); // adds element to the end of the list.
        list.offerFirst("Oman"); // adds element to the start of the list.
    }
    public static void removeElements(LinkedList<String> list) {
        list.remove(1); // removes element at the mentioned index from the list.
        list.remove("India"); // removes first occurrence of the element from the list.

        String s1 = list.remove(); // removes first element of the list.
        System.out.println(s1 + " is removed.");
        String s2 = list.removeFirst(); // removes first element of the list.
        System.out.println(s2 + " is removed.");
        String s3 = list.removeLast(); // removes last element of the list.
        System.out.println(s3 + " is removed.");
        System.out.println(list);
        // Stack methods
        String s5 = list.pop();
        System.out.println(s5 + " is removed."); // removes top/first element of the list.
        System.out.println(list);
        // Queue/Dequeue methods
        String s6 = list.poll();
        System.out.println(s6 + " is removed."); // removes first element of the list.
        String s7 = list.pollFirst();
        System.out.println(s7 + " is removed."); // removes first element of the list.
        String s8 = list.pollLast();
        System.out.println(s8 + " is removed."); // removes last element of the list.
        System.out.println(list);
        list.clear();
    }
    public static void fetchElements(LinkedList<String> list) {
        String s1 = list.get(2); // Fetches element based on the index.
        System.out.println(s1);
        String s2 = list.getFirst(); // Fetches first element in the list.
        System.out.println(s1);
        String s3 = list.getLast(); // Fetches last element in the list.
        System.out.println(s3);
        int s4 = list.indexOf("Europe"); // Fetches the index of first occurrence of element in the list.
        System.out.println("Europe is at index " + s4);
        int s5 = list.indexOf("Japan"); // Fetches the index of last occurrence of element in the list.
        System.out.println("Japan is at index " + s5);

        // Stack methods
        System.out.println("Element from peek() " + list.peek()); // Fetches first/top element
        System.out.println("Element from peekFirst() " + list.peekFirst()); // Fetches first/top element
        System.out.println("Element from peekLast() " + list.peekLast()); // Fetches last/bottom element

        //Queue methods
        System.out.println("Element from element() " + list.element()); // Fetches first/top element
    }
    public static void printItinerary1(LinkedList<String> list) {
        //[Oman, Dubai, Japan, Zimbabwe]
        System.out.println("Trip starts from " + list.getFirst());
        for (int i = 1; i < list.size(); i++) {
            System.out.println("---> From " + list.get(i-1) + " To " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());
//        Trip starts from Oman
//        ---> From Oman To Dubai
//        ---> From Dubai To Japan
//        ---> From Japan To Zimbabwe
//        Trip end at Zimbabwe
    }
    public static void printItinerary2(LinkedList<String> list) {
        //[Oman, Dubai, Japan, Zimbabwe]
        System.out.println("Trip starts from " + list.getFirst());
        String previousCountry = list.getFirst();
        for (String country : list) {
            System.out.println("---> From " + previousCountry + " To " + country);
        }
        System.out.println("Trip ends at " + list.getLast());
//        Trip starts from Oman
//        ---> From Oman To Oman
//        ---> From Oman To Dubai
//        ---> From Oman To Japan
//        ---> From Oman To Zimbabwe
//        Trip end at Zimbabwe
    }
    public static void printItinerary3(LinkedList<String> list) {
        //[Oman, Dubai, Japan, Zimbabwe]
        System.out.println("Trip starts from " + list.getFirst());
        ListIterator<String> iterator = list.listIterator(1); // we can provide the index to start from.
        String previousCountry = list.getFirst();
        while (iterator.hasNext()) {
            String nextCountry = iterator.next();
            System.out.println("---> From " + previousCountry + " To " + nextCountry);
            previousCountry = nextCountry;
        }
        System.out.println("Trip ends at " + list.getLast());
//        Trip starts from Oman
//        ---> From Oman To Dubai
//        ---> From Dubai To Japan
//        ---> From Japan To Zimbabwe
//        Trip ends at Zimbabwe
    }
}
