// Day 17: Unit 2 - String Manipulation
// Topic: Valid Anagram using Frequency Array (Java)

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";

        boolean result = isAnagram(s, t);
        System.out.println("Are they anagrams? " + result);
    }

    public static boolean isAnagram(String s, String t) {
        // Step 1: Check length
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Create a tally sheet for 26 alphabets
        int[] count = new int[26];

        // Step 3: Fill the tally sheet
        for (int i = 0; i < s.length(); i++) {
            // 'a' has an ASCII value. Subtracting 'a' gives us index 0-25.
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        // Step 4: Check if all counts are zero
        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }
}
