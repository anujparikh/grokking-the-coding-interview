package slidingwindow;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordConcatenationTest {
    @Test
    public void simpleTest() {
        System.out.println(WordConcatenation.findWordConcatenation("catfoxcat", new String[]{"cat", "fox"}));
        System.out.println(WordConcatenation.findWordConcatenation("catcatfoxfox", new String[]{"cat", "fox"}));
        System.out.println(WordConcatenation.findWordConcatenation("catcatfoxfox", new String[]{"cat", "cat"}));
        System.out.println(WordConcatenation.findWordConcatenation("batcatcatbat", new String[]{"cat", "bat"}));
    }
}
