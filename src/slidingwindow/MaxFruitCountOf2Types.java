package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class MaxFruitCountOf2Types {
    public static int findLength(char[] arr) {
        int windowStart = 0;
        int maxCount = Integer.MIN_VALUE;
        Map<Character, Integer> distinctFruits = new HashMap<>();
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            Character windowEndChar = Character.valueOf(arr[windowEnd]);
            distinctFruits.put(windowEndChar, distinctFruits.getOrDefault(windowEndChar, 0) + 1);
            while (distinctFruits.size() > 2) {
                Character windowStartChar = Character.valueOf(arr[windowStart]);
                distinctFruits.put(windowStartChar, distinctFruits.get(windowStartChar) - 1);
                if (distinctFruits.get(windowStartChar) == 0) {
                    distinctFruits.remove(windowStartChar );
                }
                windowStart++;
            }
            maxCount = Integer.max(maxCount, windowEnd - windowStart + 1);
        }
        return maxCount;
    }
}
