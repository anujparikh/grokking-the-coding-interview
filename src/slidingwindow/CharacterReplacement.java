package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class CharacterReplacement {
    public static int findLength(String str, int k) {
        int maxLength = Integer.MIN_VALUE;
        Map<Character, Integer> charCountMap = new HashMap<>();
        int maxRepeatLetterCount = 0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            Character windowEndChar = str.charAt(windowEnd);
            charCountMap.put(windowEndChar, charCountMap.getOrDefault(windowEndChar, 0) + 1);
            maxRepeatLetterCount = Math.max(charCountMap.get(windowEndChar), maxRepeatLetterCount);
            while (windowEnd - windowStart + 1 > maxRepeatLetterCount + k) {
                Character windowStartChar = str.charAt(windowStart);
                charCountMap.put(windowStartChar, charCountMap.get(windowStartChar) - 1);
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }
}

