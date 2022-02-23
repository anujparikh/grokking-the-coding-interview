package twopointers;

import org.junit.Test;

import java.util.Arrays;

public class PairWithTargetSumTest {

    @Test
    public void simpleTest() {
        System.out.println(Arrays.toString(PairWithTargetSum.search(new int[]{1, 2, 3, 4, 6}, 6)));
        System.out.println(Arrays.toString(PairWithTargetSum.search(new int[]{2, 5, 9, 11}, 11)));
    }
}
