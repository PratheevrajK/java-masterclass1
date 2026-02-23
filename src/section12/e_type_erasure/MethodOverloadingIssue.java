package section12.e_type_erasure;

import java.util.ArrayList;
import java.util.List;

public class MethodOverloadingIssue {
    public static void main(String[] args) {
        testList(new ArrayList<String>(List.of("Arun", "Bala", "Raj")));
        testList(new ArrayList<Integer>(List.of(10,20,50)));
    }
    //'testList(List<String>)' clashes with 'testList(List<Integer>)'; both methods have same erasure
//    public static void testList(List<String> list) {
//        for (var elem : list) {
//            System.out.println(elem.toUpperCase());
//        }
//    }
//    public static void testList(List<Integer> list) {
//        for (var elem : list) {
//            System.out.println(elem.floatValue());
//        }
//    }
    public static void testList(List<?> list) {
        for (var elem : list) {
            if (elem instanceof String s) {
                System.out.println(s.toUpperCase());
            } else if (elem instanceof Integer i) {
                System.out.println(i.floatValue());
            }

        }
    }
}