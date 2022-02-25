package twopointers;

import org.junit.Test;

public class DutchFlagTest {
    @Test
    public void simpleTest() {
        DutchFlag.sort(new int[]{1, 0, 2, 1, 0});
        DutchFlag.sort(new int[]{2, 2, 0, 1, 2, 0});
    }
}
