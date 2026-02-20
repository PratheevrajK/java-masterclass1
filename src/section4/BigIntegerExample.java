package section4;

import java.math.BigInteger;

public class BigIntegerExample {
    public static void main(String[] args) {
        // Creating BigInteger objects
        BigInteger bi1 = new BigInteger("12345678901234567890"); // From String
        BigInteger bi2 = BigInteger.valueOf(10); // From long using valueOf()

        // Performing operations
        BigInteger sum = bi1.add(bi2);         // Addition: bi1 + bi2
        BigInteger product = bi1.multiply(bi2); // Multiplication: bi1 * bi2

        // Printing the results
        System.out.println("BigInteger 1: " + bi1);
        System.out.println("BigInteger 2: " + bi2);
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        // Comparison
        if (bi1.compareTo(bi2) > 0) {
            System.out.println("bi1 is greater than bi2");
        }
    }
}
