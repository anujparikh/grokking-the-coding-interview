package slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringAnagrams {
    public static List<Integer> findStringAnagrams(String str, String pattern) {
        List<Integer> resultIndices = new ArrayList<>();
        Map<Character, Integer> patternCharMap = new HashMap<>();
        int windowStart = 0;
        int matched = 0;
        for (int i = 0; i < pattern.length(); i++) {
            patternCharMap.put(pattern.charAt(i), 1);
        }
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            Character currentWindowEndChar = str.charAt(windowEnd);
            if (patternCharMap.containsKey(currentWindowEndChar)) {
                patternCharMap.put(currentWindowEndChar, patternCharMap.get(currentWindowEndChar) - 1);
            }
            if (windowEnd - windowStart + 1 > pattern.length()) {
                Character currentWindowStartChar = str.charAt(windowStart);
                if (patternCharMap.containsKey(currentWindowStartChar)) {
                    patternCharMap.put(currentWindowStartChar, patternCharMap.getOrDefault(currentWindowStartChar, 0) + 1);
                }
                windowStart++;
            }
            if (patternCharMap.values().stream().allMatch(n -> n == 0)) {
                resultIndices.add(windowStart);
            }
        }
        return resultIndices;
    }
}
