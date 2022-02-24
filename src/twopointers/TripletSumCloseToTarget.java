package twopointers;

import java.util.Arrays;

public class TripletSumCloseToTarget {
    public static int searchTriplet(int[] arr, int targetSum) {
        Arrays.sort(arr);
        int closetSum = Integer.MAX_VALUE;
        int sumClosetToTarget = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                int currentSum = arr[left] + arr[right] + arr[i];
                if (currentSum == targetSum) {
                    return targetSum;
                }
                if (closetSum > Math.abs(targetSum - currentSum)) {
                    closetSum = Math.abs(targetSum - currentSum);
                    sumClosetToTarget = currentSum;
                }
                if (currentSum > targetSum) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return sumClosetToTarget;
    }
}
