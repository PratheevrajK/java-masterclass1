package section13.a_nested_class.a_static_nested_class;

import section13.a_nested_class.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(1001, "Raj", 2020),
                new Employee(1005, "Pratheev", 2023),
                new Employee(1002, "Arun", 2022),
                new Employee(1004, "Kumar", 2025),
                new Employee(1003, "Bala", 2021)
        ));

        employees.sort(new Employee.EmployeeComparator<>("yearStarted")); // This is how we access static nested class.
//        employees.sort(new Employee.EmployeeComparator<>()); // Sorts by name.
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
