package slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordConcatenation {
    public static List<Integer> findWordConcatenation(String str, String[] words) {
        List<Integer> resultIndices = new ArrayList<>();
        Map<String, Integer> wordsStringMap = new HashMap<>();
        int windowStart = 0;
        int lengthOfWord = words[0].length();
        for (int i = 0; i < words.length; i++) {
            String chatAtI = words[i];
            wordsStringMap.put(chatAtI, wordsStringMap.getOrDefault(chatAtI, 0) + 1);

        }
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd = windowEnd + lengthOfWord) {
            String windowEndStr = str.substring(windowEnd, windowEnd + lengthOfWord);
            if (wordsStringMap.containsKey(windowEndStr)) {
                wordsStringMap.put(windowEndStr, wordsStringMap.get(windowEndStr) - 1);
            }
            if (windowEnd - windowStart + 1 > words.length * words[0].length()) {
                String windowStartStr = str.substring(windowStart, windowStart + lengthOfWord);
                if (wordsStringMap.containsKey(windowStartStr)) {
                    wordsStringMap.put(windowStartStr, wordsStringMap.get(windowStartStr) + 1);
                }
                windowStart = windowStart + lengthOfWord;
            }
            if (wordsStringMap.values().stream().allMatch(n -> n == 0)) {
                resultIndices.add(windowStart);
            }
        }
        return resultIndices;
    }
}
