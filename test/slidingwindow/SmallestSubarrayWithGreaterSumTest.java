package slidingwindow;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SmallestSubarrayWithGreaterSumTest {
    @Test
    public void simpleTest() {
        assertEquals(2, SmallestSubarrayWithGreaterSum.findMinSubArray(7, new int[]{2, 1, 5, 2, 3, 2}));
        assertEquals(1, SmallestSubarrayWithGreaterSum.findMinSubArray(7, new int[]{2, 1, 5, 2, 8}));
        assertEquals(3, SmallestSubarrayWithGreaterSum.findMinSubArray(8, new int[]{3, 4, 1, 1, 6}));
    }
}
