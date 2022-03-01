package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numMap.containsKey(target - nums[i])) {
                return new int[]{i, numMap.get(target - nums[i])};
            } else {
                numMap.put(nums[i], i);
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(TwoSum.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(TwoSum.twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(TwoSum.twoSum(new int[]{3, 3}, 6)));
        System.out.println(Arrays.toString(TwoSum.twoSum(new int[]{10, 2, 3, 4, 5, 6, 2, 8}, 4)));
    }
}
