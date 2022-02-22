package slidingwindow;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class StringAnagramsTest {

    @Test
    public void simpleTest() {
        assertEquals(new ArrayList<>(Arrays.asList(1, 2)), StringAnagrams.findStringAnagrams("ppqp", "pq"));
        assertEquals(new ArrayList<>(Arrays.asList(2, 3, 4)), StringAnagrams.findStringAnagrams("abbcabc", "abc"));
        assertEquals(new ArrayList<>(Arrays.asList(0, 2, 3)), StringAnagrams.findStringAnagrams("dabadb", "abd"));
    }
}
