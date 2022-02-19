package slidingwindow;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumSumSubarrayOfSizeKTest {

    @Test
    public void simpleTest() {
        assertEquals(9, MaximumSumSubarrayOfSizeK.maximumSumOfSubArray(new int[]{2, 1, 5, 1, 3, 2}, 3));
        assertEquals(7, MaximumSumSubarrayOfSizeK.maximumSumOfSubArray(new int[]{2, 3, 4, 1, 5}, 2));
    }
}
