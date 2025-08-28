package section10.b_arraylist_challenge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArraylistChallenge {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> groceries = new ArrayList<>();
        boolean flag = true;
        while(flag) {
            System.out.print("""
                    Enter 0 to exit,
                    1 to add and
                    2 to remove values to/from the list:""" + " ");
            switch(s.nextInt()) {
                case 1 -> addElement(groceries);
                case 2 -> removeElement(groceries);
                default -> flag = false;
            }
        }
    }

    private static void removeElement(ArrayList<String> groceries) {
        System.out.println("Enter comma-separated values to remove from the list:");
        String input = s.nextLine();
        String[] strArr = input.split(",");
        for (String item : strArr) {
            String trimmed = item.trim();
            groceries.remove(trimmed);
        }
        groceries.sort(Comparator.naturalOrder());
        System.out.println("Updated List: " + groceries);
    }

    private static void addElement(ArrayList<String> groceries) {
        System.out.println("Enter comma-separated values to add to the list:");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String[] strArr = input.split(",");
        for (String item : strArr) {
            String trimmed = item.trim();
            if (!groceries.contains(trimmed)) {
                groceries.add(trimmed);
            }
        }
        groceries.sort(Comparator.naturalOrder());
        System.out.println("Updated List: " + groceries);
    }
}
