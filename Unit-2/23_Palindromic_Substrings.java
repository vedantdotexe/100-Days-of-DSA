public class PalindromicSubstrings {
    public static void main(String[] args) {
        String s = "aaa";
        System.out.println("Total Palindromic Substrings: " + countSubstrings(s));
    }

    public static int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            // Check for odd length palindromes (center is 'i')
            count += expandFromCenter(s, i, i);
            // Check for even length palindromes (center is between 'i' and 'i+1')
            count += expandFromCenter(s, i, i + 1);
        }
        return count;
    }

    private static int expandFromCenter(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }
}
