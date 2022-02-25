package twopointers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BackspaceCompareTest {
    @Test
    public void simpleTest() {
        assertEquals(true, BackspaceCompare.compare("xy#z", "xzz#"));
        assertEquals(false, BackspaceCompare.compare("xy#z", "xyz#"));
        assertEquals(true, BackspaceCompare.compare("xp#", "xyz##"));
        assertEquals(true, BackspaceCompare.compare("xywrrmp", "xywrrmu#p"));
    }
}
