package twopointers;

import org.junit.Test;
import slidingwindow.StringPermutation;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesTest {

    @Test
    public void simpleTest() {
        assertEquals(4, RemoveDuplicates.remove(new int[]{2, 3, 3, 3, 6, 9, 9}));
        assertEquals(2, RemoveDuplicates.remove(new int[]{2, 2, 2, 11}));
        assertEquals(8, RemoveDuplicates.remove(new int[]{1,1,1,2,2,3,4,5,6,7,7,7,8}));
    }
}
