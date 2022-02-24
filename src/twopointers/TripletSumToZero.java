package twopointers;

import java.util.*;

public class TripletSumToZero {
    public static List<List<Integer>> searchTriplets(int[] arr) {
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            int start = i + 1;
            int end = arr.length - 1;
            int currentTarget = -1 * arr[i];
            while (start < end) {
                if (arr[start] + arr[end] == currentTarget) {
                    triplets.add(Arrays.asList(arr[i], arr[start], arr[end]));
                    end--;
                    start++;
                } else if (arr[start] + arr[end] > currentTarget) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        return triplets;
    }
}
