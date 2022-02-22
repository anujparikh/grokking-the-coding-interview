package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class StringPermutation {
    public static boolean findPermutation(String str, String pattern) {
        Map<Character, Integer> patternMap = new HashMap<>();
        int windowStart = 0;
        for (int i = 0; i < pattern.length(); i++) {
            Character currentChar = pattern.charAt(i);
            patternMap.put(currentChar, patternMap.getOrDefault(currentChar, 0) + 1);
        }
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            Character windowEndChar = str.charAt(windowEnd);
            if (patternMap.containsKey(windowEndChar)) {
                patternMap.put(windowEndChar, patternMap.get(windowEndChar) - 1);
            }
            while (windowEnd - windowStart + 1 > pattern.length()) {
                Character windowStartChar = str.charAt(windowStart);
                if (patternMap.containsKey(windowStartChar)) {
                    patternMap.put(windowStartChar, patternMap.get(windowStartChar) + 1);
                }
                windowStart++;
            }
            if (patternMap.values().stream().allMatch(n -> n == 0)) {
                return true;
            }
        }
        return false;
    }
}
