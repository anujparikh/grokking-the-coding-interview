package slidingwindow;

public class MaximumSumSubarrayOfSizeK {
    public static int maximumSumOfSubArray(int[] input, int size) {
        int maximum = input[0];
        int[] sum = new int[input.length - size + 1];
        int i = 1;
        int j = size;
        for (int k = 0; k < size; k++) {
            sum[0] += input[k];
        }
        if (sum[0] > maximum) {
            maximum = sum[0];
        }
        while (j < input.length) {
            sum[i] = sum[i - 1] - input[i - 1] + input[j];
            if (sum[i] > maximum) {
                maximum = sum[i];
            }
            j++;
            i++;
        }
        return maximum;
    }
}
