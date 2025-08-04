package section6;

import java.util.Scanner;

public class I_ReadingConsoleInputs {
    public static final int CURRENT_YEAR = 2025;
    public static final int MAX_AGE = 125;
    public static void main(String[] args) {
//        System.out.println(getInputFromConsole());
        System.out.println(getInputFromScanner());
    }
    public static String getInputFromConsole() {
        String name = System.console().readLine("Hi, What's your name?");
        System.out.println("Hello " + name + " , Welcome!");
        String yearOfBirth = System.console().readLine("What's your age?");
        int age = CURRENT_YEAR - Integer.parseInt(yearOfBirth);
        return "So, you are " + age + " years old.";
    }
    public static String getInputFromScanner() {
        System.out.println("Hi, What's your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name + " , Welcome!");

        boolean isValidAge = false;
        int age = 0;
        do {
            try {
                System.out.println("What's your year of birth? Year of birth should be between " +
                        (CURRENT_YEAR-MAX_AGE) + " and " + CURRENT_YEAR + ", limits inclusive.");
                String yearOfBirth = scanner.nextLine();
                age = validateYear(yearOfBirth);
                isValidAge = age >= 0;
            } catch (NumberFormatException ex) {
                System.out.println("Characters are not allowed! Please try again.");
            }
        } while (!isValidAge);
        return "So, you are " + age + " years old.";
    }
    public static int validateYear(String year) {
        int yearOfBirth = Integer.parseInt(year);
        if(yearOfBirth > CURRENT_YEAR || yearOfBirth < CURRENT_YEAR-MAX_AGE) {
            return -1;
        }
        return CURRENT_YEAR-yearOfBirth;
    }
}
