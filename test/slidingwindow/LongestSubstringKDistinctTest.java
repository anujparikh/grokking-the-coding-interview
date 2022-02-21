package slidingwindow;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubstringKDistinctTest {

    @Test
    public void simpleTest() {
        assertEquals(4, LongestSubstringKDistinct.findLength("araaci", 2));
        assertEquals(2, LongestSubstringKDistinct.findLength("araaci", 1));
        assertEquals(5, LongestSubstringKDistinct.findLength("cbbebi", 3));
        assertEquals(6, LongestSubstringKDistinct.findLength("cbbebi", 10));
    }
}
