package section6;

public class G_EvenNumberChallenge {
    public static void main(String[] args) {
        int num = 4;
        int evensCount = 0, oddsCount = 0;
        while(num <= 20) {
            num++;
            if(isEvenNumber(num)) {
                evensCount++;
                System.out.println(num + " is an even number");
                if (evensCount == 5) {
                    break;
                }
            } else {
                oddsCount++;
            }
        }
        System.out.println("Total even numbers found is " + evensCount);
        System.out.println("Total odd numbers found is " + oddsCount);
    }
    public static boolean isEvenNumber(int num) {
        return num%2 == 0;
    }
}
