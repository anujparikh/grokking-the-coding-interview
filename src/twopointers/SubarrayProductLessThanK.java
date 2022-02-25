package twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubarrayProductLessThanK {
    public static List<List<Integer>> findSubarrays(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> subarrays = new ArrayList<>();
        int windowStart = 0;
        int currentProduct = 1;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            currentProduct *= arr[windowEnd];
            while (currentProduct >= target && windowStart < arr.length) {
                currentProduct /= arr[windowStart];
                windowStart++;
            }
            List<Integer> currentList = new ArrayList<>();
            for (int i = windowEnd; i >= windowStart; i--) {
                currentList.add(arr[i]);
                subarrays.add(new ArrayList<>(currentList));
            }
        }
        return subarrays;
    }
}
