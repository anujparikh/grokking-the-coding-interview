package twopointers;

import org.junit.Test;

public class TripletSumToZeroTest {

    @Test
    public void simpleTest() {
        System.out.println(TripletSumToZero.searchTriplets(new int[]{-3, 0, 1, 2, -1, 1, -2}));
        System.out.println(TripletSumToZero.searchTriplets(new int[]{-5, 2, -1, -2, 3}));
        System.out.println(TripletSumToZero.searchTriplets(new int[]{0, 0, 0}));
        System.out.println(TripletSumToZero.searchTriplets(new int[]{3, -1, -2, 2, 0, 1}));
    }
}
