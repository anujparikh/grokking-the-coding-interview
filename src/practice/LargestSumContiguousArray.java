package practice;

/**
 * https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
 */
public class LargestSumContiguousArray {
    static int maxSubArraySum(int[] array) {
        int largestSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int windowEnd = 0; windowEnd < array.length; windowEnd++) {
            currentSum += array[windowEnd];
            largestSum = Math.max(largestSum, currentSum);

            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return largestSum;
    }

    public static void main(String[] args) {
        System.out.println(LargestSumContiguousArray.maxSubArraySum(new int[]{-2, -3, 4, -1, -2, 1, 5, -3}));
        System.out.println(LargestSumContiguousArray.maxSubArraySum(new int[]{1, 3, 4, -5, 1, 5, -2, -1}));
    }
}
