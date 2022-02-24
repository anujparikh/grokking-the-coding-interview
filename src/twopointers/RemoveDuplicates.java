package twopointers;

public class RemoveDuplicates {
    public static int remove(int[] arr) {
        int startPointer = 0;
        int endPointer = 0;
        while (endPointer < arr.length) {
            if (arr[startPointer] != arr[endPointer]) {
                arr[++startPointer] = arr[endPointer];
            }
            endPointer++;
        }
        return startPointer + 1;
    }
}
