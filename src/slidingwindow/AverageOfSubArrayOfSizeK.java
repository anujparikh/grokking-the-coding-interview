package slidingwindow;

public class AverageOfSubArrayOfSizeK {
    public static double[] findAverages(int k, int[] arr) {
        int i = 1;
        int j = k;
        double[] result = new double[arr.length - k + 1];
        double[] sum = new double[arr.length - k + 1];
        for (int p = 0; p < k; p++) {
            sum[0] += arr[p];
        }
        while (j < arr.length) {
            sum[i] = sum[i - 1] - arr[i - 1] + arr[j];
            j++;
            i++;
        }
        for (int l = 0; l < sum.length; l++) {
            result[l] = sum[l] / k;
        }
        return result;
    }
}
