package slidingwindow;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxFruitCountOf2TypesTest {

    @Test
    public void simpleTest() {
        assertEquals(3, MaxFruitCountOf2Types.findLength(new char[]{'A', 'B', 'C', 'A', 'C'}));
        assertEquals(5, MaxFruitCountOf2Types.findLength(new char[]{'A', 'B', 'C', 'B', 'B', 'C'}));
    }
}
