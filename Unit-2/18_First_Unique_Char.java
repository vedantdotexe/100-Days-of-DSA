// Day 18: Unit 2 - String Manipulation
// Topic: First Unique Character (Two-Pass Frequency Array)

public class FirstUniqueChar {
    public static void main(String[] args) {
        String s = "loveleetcode";
        int result = firstUniqChar(s);
        
        System.out.println("The index of the first unique character is: " + result);
    }

    public static int firstUniqChar(String s) {
        // Step 1: Create the Tally Sheet (26 letters)
        int[] count = new int[26];

        // First Pass: Fill the tally sheet
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        // Second Pass: Check the string again in order
        for (int i = 0; i < s.length(); i++) {
            // If this character's count in our tally sheet is exactly 1...
            if (count[s.charAt(i) - 'a'] == 1) {
                return i; // Found it! Return the index immediately.
            }
        }

        // If we finish the loop and find nothing, return -1
        return -1;
    }
}
