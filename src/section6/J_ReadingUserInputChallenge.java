package section6;

import java.util.Scanner;

public class J_ReadingUserInputChallenge {
    public static void main(String[] args) {
        int numCount = 1;
        int sum = 0;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter number #" + numCount + ":");
                int number = Integer.parseInt(scanner.nextLine());
                sum += number;
                numCount++;
            } catch(NumberFormatException ex) {
                System.out.println("Invalid number");
            }
        } while (numCount <= 5);
        System.out.println("Sum of five valid numbers is " + sum);
    }
}
