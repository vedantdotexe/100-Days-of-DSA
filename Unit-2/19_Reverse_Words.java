// Day 19: Unit 2 - String Manipulation
// Topic: Reverse Words in a String (Split and Reverse)

public class ReverseWords {
    public static void main(String[] args) {
        String s = "the sky is blue";
        String result = reverseWords(s);
        
        System.out.println("Original: " + s);
        System.out.println("Reversed: " + result);
    }

    public static String reverseWords(String s) {
        // Step 1: Split the string by spaces. 
        // "\\s+" is a regex that handles multiple spaces between words.
        String[] words = s.trim().split("\\s+");

        // Step 2: Use Two-Pointers to reverse the array of words
        int start = 0;
        int end = words.length - 1;

        while (start < end) {
            // Swap the words
            String temp = words[start];
            words[start] = words[end];
            words[end] = temp;

            start++;
            end--;
        }

        // Step 3: Join the words back together
        // String.join is a clean way to put spaces between array elements
        return String.join(" ", words);
    }
}
