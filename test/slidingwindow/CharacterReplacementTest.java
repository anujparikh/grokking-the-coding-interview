package slidingwindow;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharacterReplacementTest {

    @Test
    public void simpleTest() {
        assertEquals(5, CharacterReplacement.findLength("aabccbb", 2));
        assertEquals(4, CharacterReplacement.findLength("abbcb", 1));
        assertEquals(3, CharacterReplacement.findLength("abccde", 1));
        assertEquals(7, CharacterReplacement.findLength("aaabaaa", 1));
        assertEquals(2, CharacterReplacement.findLength("abcdefg", 1));
    }
}
