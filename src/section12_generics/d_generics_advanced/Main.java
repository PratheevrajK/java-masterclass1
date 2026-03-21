package section12_generics.d_generics_advanced;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i <10; i++) {
            students.add(new Student());
        }
        addStudent(students, new Student());
        printMoreLists(students);

        List<LpaStudent> lpaStudents = new ArrayList<>();
        for (int i = 0; i <10; i++) {
            lpaStudents.add(new LpaStudent());
        }
//        printList(lpaStudents); // Error: as the expected param type is List<Student>.
        addStudent(lpaStudents, new LpaStudent());
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
    public static void printMoreLists(List<? extends Student> students) { // Wildcard with UpperBound will be the ideal solution for just reading.
        for (Student s : students) {
            System.out.println(s.getYearStarted()+":"+s);
        }
        System.out.println("-".repeat(50));
    }

    //Instead Wildcard, TypeParameter should be used here.
    public static <T extends Student> void addStudent(List<T> students, T t) {
        students.add(t);
    }

    //java: incompatible types: Student cannot be converted to LpaStudent.
    // Can only be used for LpaStudents. Generics can't be achieved in this case.
//    public static void addStudent(List<? super LpaStudent> students, LpaStudent t) {
//        students.add(t);
//    }

}
