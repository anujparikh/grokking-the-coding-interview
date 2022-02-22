package slidingwindow;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReplacingOnesTest {

    @Test
    public void simpleTest() {
        assertEquals(6, ReplacingOnes.findLength(new int[]{0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1}, 2));
        assertEquals(9, ReplacingOnes.findLength(new int[]{0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1}, 3));
    }
}
