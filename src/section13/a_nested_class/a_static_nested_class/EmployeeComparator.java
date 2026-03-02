package section13.a_nested_class.a_static_nested_class;

import section13.a_nested_class.Employee;

import java.util.Comparator;

//This class can be made as a static nested class inside Employee class.
public class EmployeeComparator <T extends Employee> implements Comparator<Employee> {

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
                return o1.getYearStarted()-o2.getYearStarted();
            }
            return o1.getName().compareTo(o2.getName());
        }
    }