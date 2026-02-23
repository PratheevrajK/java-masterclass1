package section12.d_generics_advanced;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i <=10; i++) {
            students.add(new Student());
        }
        printMoreLists(students);

        List<LpaStudent> lpaStudents = new ArrayList<>();
        for (int i = 0; i <=10; i++) {
            lpaStudents.add(new LpaStudent());
        }
//        printList(lpaStudents); // Error: as the expected param type is List<Student>.
        printMoreLists(lpaStudents);
    }
//    public static void printList(List<Student> students) {
//        for (Student s : students) {
//            System.out.println(s);
//        }
//        System.out.println("-".repeat(50));
//    }
//    public static <T extends Student> void printList1(List<T> students) { // This also works, but not the best solution.
//        for (Student s : students) {
//            System.out.println(s);
//        }
//        System.out.println("-".repeat(50));
//    }
    public static void printMoreLists(List<? extends Student> students) { // Wildcard with UpperBound will solve the issue.
        for (Student s : students) {
            System.out.println(s.getYearStarted()+":"+s);
        }
        System.out.println("-".repeat(50));
    }
}
