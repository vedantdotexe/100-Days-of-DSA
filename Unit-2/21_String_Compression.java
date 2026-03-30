// Day 21: Unit 2 - String Manipulation
// Topic: String Compression (StringBuilder)

public class StringCompression {
    public static void main(String[] args) {
        String input = "aaabbccccd";
        System.out.println("Original: " + input);
        System.out.println("Compressed: " + compress(input));
    }

    public static String compress(String str) {
        // In Java, use StringBuilder for better performance when joining strings
        StringBuilder compressed = new StringBuilder();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            count++;

            // If the next character is different, or we are at the end...
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed.append(str.charAt(i));
                compressed.append(count);
                count = 0; // Reset count for the next character
            }
        }

        // Only return compressed if it's actually shorter than the original
        return compressed.length() < str.length() ? compressed.toString() : str;
    }
}
