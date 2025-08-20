package section9.b_arrays_helper;

import java.util.Arrays;
import java.util.Random;

public class ArrayMethods1 {
    public static void main(String[] args) {
        int[] firstArray = ArrayMethods1.getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));//[65, 44, 51, 99, 25, 71, 8, 53, 3, 11]
        System.out.println("_".repeat(50));

        int[] secondArray = ArrayMethods1.getRandomArray(10);
        System.out.println(Arrays.toString(secondArray));//[70, 90, 11, 29, 90, 5, 31, 63, 28, 34]
        Arrays.sort(secondArray);
        System.out.println(Arrays.toString(secondArray));//[5, 11, 28, 29, 31, 34, 63, 70, 90, 90]
        System.out.println("_".repeat(50));

        int[] thirdArray = new int[10];
        System.out.println(Arrays.toString(thirdArray));//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        Arrays.fill(thirdArray, 3);
        System.out.println(Arrays.toString(thirdArray));//[3, 3, 3, 3, 3, 3, 3, 3, 3, 3]
        System.out.println("_".repeat(50));

        int[] fourthArray = getRandomArray(10);
        System.out.println(Arrays.toString(fourthArray));//[87, 72, 33, 23, 39, 66, 2, 42, 3, 57]
        int[] copiedArray = Arrays.copyOf(fourthArray, fourthArray.length);
        System.out.println(Arrays.toString(copiedArray));//[87, 72, 33, 23, 39, 66, 2, 42, 3, 57]
        copiedArray[5] = 100;
        System.out.println(Arrays.toString(copiedArray));//[87, 72, 33, 23, 39, 100, 2, 42, 3, 57]
        System.out.println(Arrays.toString(fourthArray));//[87, 72, 33, 23, 39, 66, 2, 42, 3, 57]
        System.out.println("_".repeat(50));

        int[] smallerArray = Arrays.copyOf(fourthArray, 7);
        System.out.println(Arrays.toString(smallerArray));//[87, 72, 33, 23, 39, 66, 2]
        int[] largerArray = Arrays.copyOf(fourthArray, 15);
        System.out.println(Arrays.toString(largerArray));//[87, 72, 33, 23, 39, 66, 2, 42, 3, 57, 0, 0, 0, 0, 0]

        int[] fifthArray = {1,2,3,4,5}; //Anonymous array.
        int[] sixthArray = {1,3,4,5,2};
        // Number of elements, their order and value must match.
        System.out.println(Arrays.equals(fifthArray, sixthArray));//false
        sixthArray = new int[]{1, 2, 3, 4, 5, 0};
        System.out.println(Arrays.equals(fifthArray, sixthArray));//false
        sixthArray = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.equals(fifthArray, sixthArray));//true
    }
    public static int[] getRandomArray(int length) {
        Random random = new Random();
        int[] arr = new int[length];
        for (int i = 0; i <length; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }
}
