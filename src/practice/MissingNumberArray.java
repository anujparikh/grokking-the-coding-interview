package practice;

/**
 * https://leetcode.com/problems/missing-number/
 */
public class MissingNumberArray {
    public static int missingNumber(int[] nums) {
        int sum = 0;
        int lengthOfArray = nums.length;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int expectedSum = (lengthOfArray * (lengthOfArray - 1)) / 2;
        return expectedSum - sum + nums.length;
    }

    public static void main(String[] args) {
        System.out.println(MissingNumberArray.missingNumber(new int[]{3, 0, 1}));
        System.out.println(MissingNumberArray.missingNumber(new int[]{0, 1}));
        System.out.println(MissingNumberArray.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }
}
