package section9.a_arrays;

public class Basics {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        intArray[3] = 20;
        System.out.println(intArray[3]);
        System.out.println(intArray.length);
        System.out.println("Iterating over Arrays----");
        for (int i=0; i<intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        double[] doubleArray = new double[] {2,5,7,9,4};
        System.out.println("Iterating over doubleArray----");
        for (double item : doubleArray) {
            System.out.println(item);
        }
    }
}
