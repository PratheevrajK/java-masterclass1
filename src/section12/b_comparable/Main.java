package section12.b_comparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student bala = new Student("bala");
        Student arun = new Student("arun");
        Student raj = new Student("raj");
        Student[] students = {bala, arun, raj};
        Arrays.sort(students); // sort function will throw error, if we don't implement Comparable Interface in Student class.
        System.out.println(Arrays.toString(students));
//        bala.compareTo("pratheev"); Including TypeParameter in Comparable would restrict passing other types to compare method.

    }
}

class Student implements Comparable<Student> {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }
}