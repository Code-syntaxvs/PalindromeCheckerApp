/**
 * UseCase2PalindromeCheckerApp
 * UC2: Print a Hardcoded Palindrome Result
 *
 * Objective:
 * Check whether a hardcoded string is a palindrome
 * and display the result on the console.
 */

public class UseCase2PalindromeCheckerApp {

    // Main method - Entry point of Java application
    public static void main(String[] args) {

        // Hardcoded string (String Literal)
        String word = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string using loop
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check palindrome using conditional statement
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        // Program ends
        System.out.println("Program Execution Completed.");
    }
}
