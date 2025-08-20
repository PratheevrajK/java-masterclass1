package section9.c_descending_sort_challenge;

import java.util.Arrays;

public class DescendingSort {
    public static void main(String[] args) {
        int[] arr = {3,1,4,2};
        System.out.println("New array: " + Arrays.toString(arr));
        sortArray(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
    public static void sortArray(int[] arr) {
        boolean flag = true;
        while(flag) {
            flag = false;
            int temp;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] < arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    flag = true;
                }
                System.out.println("-->" + Arrays.toString(arr));
            }
        }
    }
}
