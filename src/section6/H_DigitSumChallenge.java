package section6;

public class H_DigitSumChallenge {
    public static void main(String[] args) {
        int number = 80720;
        System.out.println("Sum of digits of " + number + " is " + sumDigits(number));
    }
    public static int sumDigits(int number) {
        if (number<0) {
            return -1;
        }
        int sum = 0;
        while (number > 9) { // Once we get a single digit end the loop.
            int rem = number%10;
            sum += rem;
            number /= 10;
        }
        sum += number; // Sum up the last single digit.
        return sum;
    }
}
