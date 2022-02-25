package twopointers;

import org.junit.Test;

import java.util.Arrays;

public class SubarrayProductLessThanKTest {
    @Test
    public void simpleTest() {
        System.out.println(SubarrayProductLessThanK.findSubarrays(new int[]{2, 5, 3, 10}, 30));
        System.out.println(SubarrayProductLessThanK.findSubarrays(new int[]{8, 2, 6, 5}, 50));
    }
}
