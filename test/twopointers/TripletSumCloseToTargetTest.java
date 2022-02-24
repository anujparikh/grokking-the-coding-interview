package twopointers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TripletSumCloseToTargetTest {
    @Test
    public void simpleTest() {
        assertEquals(1, TripletSumCloseToTarget.searchTriplet(new int[]{-2, 0, 1, 2}, 2));
        assertEquals(0, TripletSumCloseToTarget.searchTriplet(new int[]{-3, -1, 1, 2}, 1));
        assertEquals(3, TripletSumCloseToTarget.searchTriplet(new int[]{1, 0, 1, 1}, 100));
    }
}
