package section9.e_reverse_array_challenge;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Original Array: " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
    //Half-length loop approach.
//    public static void reverse(int[] arr) {
//        int maxIndex = arr.length-1;;
//        for (int i = 0; i < arr.length/2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[maxIndex-i];
//            arr[maxIndex-i] = temp;
//        }
//    }
    //Two-pointer approach
    public static void reverse(int[] arr) {
        for (int l = 0, r = arr.length-1; l < r; l++, r--) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
        }
    }
}
