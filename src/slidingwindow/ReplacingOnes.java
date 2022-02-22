package slidingwindow;

public class ReplacingOnes {
    public static int findLength(int[] arr, int k) {
        int longest = Integer.MIN_VALUE;
        int windowStart = 0;
        int maxRepeat1s = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            if (arr[windowEnd] == 1) {
                maxRepeat1s++;
            }
            while (windowEnd - windowStart + 1 > maxRepeat1s + k) {
                if (arr[windowStart] == 1) {
                    maxRepeat1s--;
                }
                windowStart++;
            }
            longest = Math.max(longest, windowEnd - windowStart + 1);
        }
        return longest;
    }
}
