package practice;

/**
 * https://www.geeksforgeeks.org/number-of-subsequences-with-positive-product/
 */
public class PositiveProduct {
    static int cntSubSeq(int[] arr) {
        int positiveCount = 0;
        int negativeCount = 0;
        for (int num : arr) {
            if (num > 0) positiveCount++;
            if (num < 0) negativeCount++;
        }
        return (int) ((Math.pow(2, positiveCount) * Math.pow(2, negativeCount - 1)) - 1);
    }

    public static void main(String[] args) {
        System.out.println(PositiveProduct.cntSubSeq(new int[]{2, -3, -1, 5, -6}));
        System.out.println(PositiveProduct.cntSubSeq(new int[]{2, 3, -1, 4, 5}));
        System.out.println(PositiveProduct.cntSubSeq(new int[]{5, -1, -6}));
    }
}
