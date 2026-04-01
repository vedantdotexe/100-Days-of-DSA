public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flight"};
        System.out.println("Prefix: " + findPrefix(words));
    }

    public static String findPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Loop through each character of the FIRST word
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);

            // Compare this character with the same index in all other words
            for (int j = 1; j < strs.length; j++) {
                // If the word is shorter than 'i' or characters don't match
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
