package section13.a_nested_class;

import java.util.Comparator;

public class Employee {

    //<T extends Employee> means this static class will accept the type Employee or its subclass.
    public static class EmployeeComparator <T extends Employee> implements Comparator<Employee> {

        private String sortType;

        public EmployeeComparator() {
            this("name");
        }

        public EmployeeComparator(String sortType) {
            this.sortType = sortType;
        }

        @Override
        public int compare(Employee o1, Employee o2) {
            if (sortType.equals("yearStarted")) {
                return o1.yearStarted-o2.yearStarted; // Inner class can access outer class's private fields as well and vice versa. This is the advantage of static nested class. This eliminates the need for getters of outer class fields.
            }
            return o1.name.compareTo(o2.name);
        }
    }

    private int id;
    private String name;
    private int yearStarted;

    public Employee() { }

    public Employee(int id, String name, int yearStarted) {
        this.id = id;
        this.name = name;
        this.yearStarted = yearStarted;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    @Override
    public String toString() {
        return "%d %-8s %d".formatted(id, name, yearStarted);
    }
}
