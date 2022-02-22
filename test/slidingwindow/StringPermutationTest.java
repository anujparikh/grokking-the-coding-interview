package slidingwindow;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringPermutationTest {

    @Test
    public void simpleTest() {
        assertEquals(true, StringPermutation.findPermutation("oidbcaf", "abc"));
        assertEquals(false, StringPermutation.findPermutation("odicf", "dc"));
        assertEquals(true, StringPermutation.findPermutation("bcdxabcdy", "bcdyabcdx"));
        assertEquals(true, StringPermutation.findPermutation("aaacb", "abc"));
        assertEquals(true, StringPermutation.findPermutation("aaabcd", "aa"));
        assertEquals(false, StringPermutation.findPermutation("aabcd", "aaa"));
    }
}
