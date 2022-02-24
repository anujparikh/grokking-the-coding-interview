package twopointers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TripletWithSmallerSumTest {
    @Test
    public void simpleTest() {
        assertEquals(2, TripletWithSmallerSum.searchTriplets(new int[]{-1, 0, 2, 3}, 3));
        assertEquals(4, TripletWithSmallerSum.searchTriplets(new int[]{-1, 4, 2, 1, 3}, 5));
    }
}
