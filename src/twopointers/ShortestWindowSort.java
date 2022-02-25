package twopointers;

public class ShortestWindowSort {
    public static int sort(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        boolean continueExec = true;
        while (start < end && continueExec) {
            continueExec = false;
            if (arr[start] <= arr[start + 1]) {
                start++;
                continueExec = true;
            }
            if (arr[end] >= arr[end - 1]) {
                end--;
                continueExec = true;
            }
        }
        if (continueExec) {
            return 0;
        }
        int currentResult = end - start + 1;
        int minimumInSubArray = Integer.MAX_VALUE;
        int maximumInSubArray = Integer.MIN_VALUE;

        for (int i = start; i < end; i++) {
            minimumInSubArray = Math.min(minimumInSubArray, arr[i]);
            maximumInSubArray = Math.max(maximumInSubArray, arr[i]);
        }

        for (int i = start - 1; i >= 0; i--) {
            if (arr[i] > minimumInSubArray) currentResult++;
        }

        for (int i = end + 1; i < arr.length; i++) {
            if (arr[i] < maximumInSubArray) currentResult++;
        }

        return currentResult;
    }
}
