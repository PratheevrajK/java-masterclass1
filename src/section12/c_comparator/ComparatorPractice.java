package section12.c_comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class ComparatorPractice {
    public static void main(String[] args) {
        Student bala = new Student("Bala");
        Student arun = new Student("Arun");
        Student raj = new Student("Raj");
        Student[] students = {bala, arun, raj};
        Comparator<Student> gpaSorter = new StudentGpaComparator().reversed();
        Comparator<Student> nameSorter = (a, b) -> b.name.compareTo(a.name); // name descending sort.
        Comparator<Student> idSorter = Comparator.comparingInt(a -> a.id); // Id sort.
        Arrays.sort(students, gpaSorter.thenComparing(nameSorter)); // First sort by GPA descending and then by name descending.
        System.out.println(Arrays.toString(students));
        //[1000 - (Bala with GPA=9.529865), 1001 - (Arun with GPA=8.326862), 1002 - (Raj with GPA=4.932848)]
    }
}


class Student {
    protected String name;
    protected int id;
    protected double gpa;

    private static int LAST_ID = 1000;
    private static Random random = new Random();

    public Student(String name) {
        this.name = name;
        this.id = LAST_ID++;
        this.gpa = random.nextDouble(1.0, 10.0);
    }

    @Override
    public String toString() {
        return "%d - (%s with GPA=%f)".formatted(id, name, gpa);
    }
}

class StudentGpaComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (int) (o1.gpa-o2.gpa);
    }
}
