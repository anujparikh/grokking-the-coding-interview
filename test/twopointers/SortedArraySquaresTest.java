package twopointers;

import org.junit.Test;

import java.util.Arrays;

public class SortedArraySquaresTest {
    @Test
    public void simpleTest() {
        System.out.println(Arrays.toString(SortedArraySquares.makeSquares(new int[]{-2, -1, 0, 2, 3})));
        System.out.println(Arrays.toString(SortedArraySquares.makeSquares(new int[]{-3, -1, 0, 1, 2})));
        System.out.println(Arrays.toString(SortedArraySquares.makeSquares(new int[]{-5, -4, -3, -2, 1, 3})));
        System.out.println(Arrays.toString(SortedArraySquares.makeSquares(new int[]{-10, -1, 0, 1, 2, 3, 4, 5, 6, 7})));
    }
}
