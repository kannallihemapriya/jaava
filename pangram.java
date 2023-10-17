public class PangramCheck {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog"; // Replace this with your input string
        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Create an array to track the presence of each letter (A-Z)
        boolean[] isPresent = new boolean[26];

        // Convert the input to lowercase for case-insensitive checking
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a lowercase letter
            if ('a' <= ch && ch <= 'z') {
                isPresent[ch - 'a'] = true;
            }
        }

        // Check if all letters from 'a' to 'z' are present
        for (boolean letter : isPresent) {
            if (!letter) {
                return false;
            }
        }

        return true;
    }
}
