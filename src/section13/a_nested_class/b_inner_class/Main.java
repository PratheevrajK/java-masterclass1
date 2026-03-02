package section13.a_nested_class.b_inner_class;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee(1001, "Raj", 2020, "Amazom"),
                new StoreEmployee(1005, "Pratheev", 2023, "Amazom"),
                new StoreEmployee(1002, "Arun", 2022, "Flipkart"),
                new StoreEmployee(1004, "Kumar", 2025, "Amazon"),
                new StoreEmployee(1003, "Bala", 2021, "Flipkart")
        ));

        storeEmployees.sort(new StoreEmployee().new StoreComparator<>()); // This is how we initialize inner class.

        for (StoreEmployee emp : storeEmployees) {
            System.out.println(emp);
        }
    }
}
