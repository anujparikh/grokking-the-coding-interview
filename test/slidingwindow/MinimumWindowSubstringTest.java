package slidingwindow;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MinimumWindowSubstringTest {
    @Test
    public void simpleTest() {
        assertEquals("abdec", MinimumWindowSubstring.findSubstring("aabdec", "abc"));
        assertEquals("aabdec", MinimumWindowSubstring.findSubstring("aabdec", "abac"));
        assertEquals("bca", MinimumWindowSubstring.findSubstring("abdbca", "abc"));
        assertEquals("", MinimumWindowSubstring.findSubstring("adcad", "abc"));
        assertEquals("baac", MinimumWindowSubstring.findSubstring("dbaace", "abc"));
    }
}
