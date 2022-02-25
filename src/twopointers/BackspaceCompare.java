package twopointers;

public class BackspaceCompare {
    public static boolean compare(String str1, String str2) {
        String modifiedStr1 = removeBackspace(str1);
        String modifiedStr2 = removeBackspace(str2);
        return modifiedStr1.equals(modifiedStr2);
    }

    private static String removeBackspace(String input) {
        StringBuilder output = new StringBuilder();
        for (int j = 0; j < input.length();) {
            if (input.charAt(j) != '#') {
                output.append(input.charAt(j));
            } else {
                output.deleteCharAt(output.length() - 1);
            }
            j++;
        }
        return output.toString();
    }
}
