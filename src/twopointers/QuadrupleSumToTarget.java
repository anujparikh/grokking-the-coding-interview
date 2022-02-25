package twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuadrupleSumToTarget {
    public static List<List<Integer>> searchQuadruplets(int[] arr, int target) {
        List<List<Integer>> quadruplets = new ArrayList<>();
        Arrays.sort(arr);
        for (int first = 0; first < arr.length - 3; first++) {
            for (int second = first + 1; second < arr.length - 2; second++) {
                int left = second + 1;
                int right = arr.length - 1;
                while (left < right) {
                    int currentSum = arr[first] + arr[second] + arr[left] + arr[right];
                    if (currentSum == target) {
                        quadruplets.add(Arrays.asList(arr[first], arr[second], arr[left], arr[right]));
                        left++;
                        while (left < right && arr[left] == arr[left - 1]) {
                            left++;
                        }
                        right--;
                        while (left < right && arr[right + 1] == arr[right]) {
                            right--;
                        }
                    } else if (currentSum < target) {
                        left++;
                        while (left < right && arr[left] == arr[left - 1]) {
                            left++;
                        }
                    } else {
                        right--;
                        while (left < right && arr[right + 1] == arr[right]) {
                            right--;
                        }
                    }
                }
            }
        }
        return quadruplets;
    }
}
