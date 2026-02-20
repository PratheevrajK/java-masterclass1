package section6;

public class F_Sum3and5Challenge {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i%15 == 0) { // (i%3 == 0 && i%5 == 0) is simplified
                System.out.println("Found a match - " + i);
                sum += i;
                count++;
                if(count == 5) {
                    break;
                }
            }
        }
        System.out.println("Sum = " + sum);
//        Found a match - 15
//        Found a match - 30
//        Found a match - 45
//        Found a match - 60
//        Found a match - 75
//        Sum = 225
    }
}
