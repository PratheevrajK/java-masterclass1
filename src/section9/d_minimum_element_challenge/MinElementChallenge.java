package section9.d_minimum_element_challenge;

import java.util.Arrays;
import java.util.Scanner;

public class MinElementChallenge {
    public static void main(String[] args) {
        System.out.println("Enter comma separated integers:");
        Scanner s = new Scanner(System.in);
        int[] arr = readIntegers(s.nextLine());
//        int[] arr = {4,7,1,5,2};
        System.out.println(Arrays.toString(arr));
        int minValue = findMin(arr);
        System.out.println("Min value = " + minValue);
    }

    public static int[] readIntegers(String input) {
        String[] inputArr = input.split(",");
        int[] arr = new int[inputArr.length];
        for (int i = 0; i < inputArr.length; i++) {
            arr[i] = Integer.parseInt(inputArr[i].trim());
        }
        return arr;
    }
    public static int findMin(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
