package twopointers;

import java.util.Arrays;

public class DutchFlag {
    public static void sort(int[] arr) {
        int pointerForZero = 0;
        int pointerForTwo = arr.length - 1;
        for (int i = 0; i <= pointerForTwo; ) {
            int numAtI = arr[i];
            if (numAtI == 0) {
                swap(arr, i, pointerForZero);
                i++;
                pointerForZero++;
            } else if (numAtI == 1) {
                i++;
            } else {
                swap(arr, i, pointerForTwo);
                pointerForTwo--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
