package practice;

import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/kth-largest-element-in-an-array/
 */
public class KLargestElement {
    public static int findKLargestElement(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        System.out.println(KLargestElement.findKLargestElement(new int[]{3, 2, 1, 5, 6, 4}, 2));
        System.out.println(KLargestElement.findKLargestElement(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }
}
