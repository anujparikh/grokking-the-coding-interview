package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class NoRepeatSubstring {
    public static int findLength(String str) {
       int windowStart = 0;
        Map<Character, Boolean> distinctCharacters = new HashMap<>();
        int longest = Integer.MIN_VALUE;
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            while (distinctCharacters.containsKey(str.charAt(windowEnd))) {
                distinctCharacters.remove(str.charAt(windowStart));
                windowStart++;
            }
            distinctCharacters.put(str.charAt(windowEnd), true);
            longest = Math.max(longest, windowEnd - windowStart + 1);
        }
        return longest;
    }
}
