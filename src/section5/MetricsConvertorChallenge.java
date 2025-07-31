package section5;

public class MetricsConvertorChallenge {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(5, 8));
        System.out.println(convertToCentimeters(3, 11));
        System.out.println(convertToCentimeters(6, 0));
        System.out.println(convertToCentimeters(0, 9));
    }
    public static double convertToCentimeters(int inchValue) {
        return 2.54 * inchValue;
    }
    public static double convertToCentimeters(int feetValue, int inchValue) {
        int totalInchValue = (feetValue * 12) + inchValue;
        return convertToCentimeters(totalInchValue);
    }
}
