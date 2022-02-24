package twopointers;

public class SortedArraySquares {
    public static int[] makeSquares(int[] arr) {
        int[] squares = new int[arr.length];
        int currentPointerForSquares = 0;
        int positivePointer = 0;
        while(arr[positivePointer] < 0) {
            positivePointer++;
        }
        int negativePointer = positivePointer - 1;
        while(positivePointer < arr.length || negativePointer >= 0) {
            if (negativePointer >= 0 && positivePointer < arr.length) {
                int negativeNumber = arr[negativePointer];
                int positiveNumber = arr[positivePointer];
                if (negativeNumber * -1 > positiveNumber) {
                    squares[currentPointerForSquares] = positiveNumber * positiveNumber;
                    positivePointer++;
                } else {
                    squares[currentPointerForSquares] = negativeNumber * negativeNumber;
                    negativePointer--;
                }
            } else if (positivePointer < arr.length && negativePointer < 0) {
                squares[currentPointerForSquares] = arr[positivePointer] * arr[positivePointer];
                positivePointer++;
            } else {
                squares[currentPointerForSquares] = arr[negativePointer] * arr[negativePointer];
                negativePointer--;
            }
            currentPointerForSquares++;
        }
        return squares;
    }
}
