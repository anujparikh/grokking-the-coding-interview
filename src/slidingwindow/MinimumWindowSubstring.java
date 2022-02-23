package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public static String findSubstring(String str, String pattern) {
        Map<Character, Integer> patternMap = new HashMap<>();
        int leastSubStringLength = Integer.MAX_VALUE;
        int leastSubStringStart = 0;
        int windowStart = 0;
        int matched = 0;
        for (Character c: pattern.toCharArray()) {
            patternMap.put(c, patternMap.getOrDefault(c, 0) + 1);
        }
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            Character windowEndChar = str.charAt(windowEnd);
            if (patternMap.containsKey(windowEndChar)) {
                patternMap.put(windowEndChar, patternMap.get(windowEndChar) - 1);
                if (patternMap.get(windowEndChar) >= 0) {
                    matched++;
                }
            }

            while (matched == pattern.length()) {
                if (windowEnd - windowStart + 1 < leastSubStringLength) {
                    leastSubStringLength = windowEnd - windowStart + 1;
                    leastSubStringStart = windowStart;
                }
                Character windowStartChar = str.charAt(windowStart);
                windowStart++;
                if (patternMap.containsKey(windowStartChar)) {
                    if (patternMap.get(windowStartChar) == 0) {
                        matched--;
                    }
                    patternMap.put(windowStartChar, patternMap.get(windowStartChar) + 1);
                }
            }
        }
        return leastSubStringLength > str.length() ? "" : str.substring(leastSubStringStart, leastSubStringStart + leastSubStringLength);
    }
}
