package section13.a_nested_class.b_inner_class;

import section13.a_nested_class.Employee;

import java.util.Comparator;

public class StoreEmployee extends Employee {

    public class StoreComparator <T extends StoreEmployee> implements Comparator<StoreEmployee> {

        @Override
        public int compare(StoreEmployee o1, StoreEmployee o2) {
            int result = o1.store.compareTo(o2.store); //First sort by store.
            if (result==0) {
                return new Employee.EmployeeComparator<>("yearStarted").compare(o1, o2); // then sort by yearStarted.
            }
            return result;
        }

    }

    private String store;

    public StoreEmployee() { }

    public StoreEmployee(int id, String name, int yearStarted, String store) {
        super(id, name, yearStarted);
        this.store = store;
    }

    @Override
    public String toString() {
        return "%-8s %s".formatted(super.toString(), store);
    }
}
