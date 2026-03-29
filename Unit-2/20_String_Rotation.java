// Day 20: Unit 2 - String Manipulation
// Topic: String Rotation (The Concatenation Trick)

public class StringRotation {
    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";

        boolean result = isRotation(s1, s2);
        System.out.println("Is '" + s2 + "' a rotation of '" + s1 + "'? " + result);
    }

    public static boolean isRotation(String s1, String s2) {
        // Step 1: Check if lengths are the same (if not, it's impossible)
        if (s1.length() != s2.length() || s1.length() == 0) {
            return false;
        }

        // Step 2: The "Cheat Code"
        // Create a double version of the first string
        String combined = s1 + s1;

        // Step 3: Check if s2 exists inside the combined string
        return combined.contains(s2);
    }
}
