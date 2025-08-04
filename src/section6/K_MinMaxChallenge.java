package section6;

import java.util.Scanner;

public class K_MinMaxChallenge {
    public static void main(String[] args) {
        int count = 0;
        double min = 0;
        double max = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter any number, or character to Exit:");
            try {
                double number = Double.parseDouble(scanner.nextLine());
                if (count == 0 || number < min) {
                    min = number;
                }
                if (count == 0 || number > max) {
                    max = number;
                }
                count++;
            } catch (NumberFormatException ex) {
                System.out.println("Got a character, exiting the program!");
                break;
            }
        }
        if (count > 0) {
            System.out.println("Min value is " + min + " and Max value is " + max);
        } else{
            System.out.println("No valid number is entered!");
        }
    }
}
