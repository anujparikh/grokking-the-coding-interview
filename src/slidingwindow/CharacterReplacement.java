package slidingwindow;

public class CharacterReplacement {
    public static int findLength(String str, int k) {
        int maxLength = Integer.MIN_VALUE;
        for (int windowStart = 0; maxLength < str.length() - windowStart; windowStart++) {
            int changed = 0;
            for (int windowEnd = windowStart; changed <= k && windowEnd < str.length(); windowEnd++) {
                if (str.charAt(windowStart) != str.charAt(windowEnd)) {
                    if (changed == k) {
                        break;
                    }
                    changed++;
                }
                maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
            }
        }
        return maxLength;
    }
}
