package practice;

/**
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 */
public class SearchRotatedSortedArray {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int midpoint = left + (right - left) / 2;
            if (nums[midpoint] > nums[right]) {
                left = midpoint + 1;
            } else {
                right = midpoint;
            }
        }
        int start, end;
        if (target == nums[nums.length - 1]) return nums.length - 1;
        if (target > nums[nums.length - 1]) {
            start = 0;
            end = left - 1;
        } else {
            start = left;
            end = nums.length - 1;
        }
        while (start <= end) {
            int midpoint = start + (end - start) / 2;
            if (target == nums[midpoint]) return midpoint;
            if (target > nums[midpoint]) {
                start = midpoint + 1;
            } else {
                end = midpoint - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(SearchRotatedSortedArray.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
        System.out.println(SearchRotatedSortedArray.search(new int[]{1, 2, 3, 4, 5, 6, 7}, 3));
        System.out.println(SearchRotatedSortedArray.search(new int[]{6, 7, 0, 1, 2, 3, 4, 5}, 2));
        System.out.println(SearchRotatedSortedArray.search(new int[]{1}, 0));
    }
}
