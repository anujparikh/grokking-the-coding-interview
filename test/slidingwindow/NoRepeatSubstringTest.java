package slidingwindow;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NoRepeatSubstringTest {

    @Test
    public void simpleTest() {
        assertEquals(3, NoRepeatSubstring.findLength("aabccbb"));
        assertEquals(2, NoRepeatSubstring.findLength("abbbb"));
        assertEquals(3, NoRepeatSubstring.findLength("abccde"));
        assertEquals(5, NoRepeatSubstring.findLength("abcaefcda"));
    }
}
