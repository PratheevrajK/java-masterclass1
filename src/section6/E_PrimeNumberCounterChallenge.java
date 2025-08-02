package section6;

public class E_PrimeNumberCounterChallenge {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 20; i <= 1000; i++) {
            if(isPrime(i)) {
                System.out.println(i);
                counter++;
                if(counter >= 3) {
                    break;
                }
            }
        }
    }
    public static boolean isPrime(int number) {
        if (number <= 2) {
            return number == 2;
        }
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
