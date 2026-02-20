package section9.c_descending_sort_challenge;

import java.util.Arrays;
//Bubble sort
//Time complexity - O[n2]
//Space complexity - O[1]
public class DescendingSort {
    public static void main(String[] args) {
        int[] arr = {3,1,4,2};
        System.out.println("New array: " + Arrays.toString(arr));
        sortArray(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
    public static void sortArray(int[] arr) {
        boolean swapped = true;
        int endIndex = arr.length-1;
        while(swapped) {
            swapped = false;
            int temp;
            for (int i = 0; i < endIndex; i++) {
                if(arr[i] < arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swapped = true;
                }
                System.out.println("-->" + Arrays.toString(arr));
            }
            endIndex--;//Shrink the inner loop as the tail gets sorted
        }
    }
}
