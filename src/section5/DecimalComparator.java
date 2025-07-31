package section5;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.123, -3.123));
    }
    public static boolean areEqualByThreeDecimalPlaces(double value1, double value2) {
        System.out.println((long) (value1*1000) + "," + (long) (value2*1000));
        return (int) (value1*1000) - (int) (value2*1000) == 0;
    }
}