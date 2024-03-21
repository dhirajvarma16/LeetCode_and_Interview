public class MissingAlphabets {

    public static void main(String[] args) {
        String input = "Hello, World!";
        printMissingAlphabets(input);
    }

    public static void printMissingAlphabets(String input) {
        // Convert input string to lowercase to handle case insensitivity
        input = input.toLowerCase();

        // Create an array to keep track of alphabets
        boolean[] alphabets = new boolean[26];

        // Mark alphabets present in the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                alphabets[ch - 'a'] = true;
            }
        }

        // Print missing alphabets
        System.out.println("Missing Alphabets:");
        for (int i = 0; i < 26; i++) {
            if (!alphabets[i]) {
                char missingChar = (char) ('a' + i);
                System.out.print(missingChar + " ");
            }
        }
    }
}
