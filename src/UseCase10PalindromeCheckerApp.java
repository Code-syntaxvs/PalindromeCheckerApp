import java.util.Scanner;

public class UseCase10PalindromeCheckerApp {

    // Method to check palindrome after normalization
    public static boolean isPalindrome(String input) {

        // Step 1: Normalize string
        // Remove all spaces using regular expression
        String normalized = input.replaceAll("\\s+", "");

        // Convert to lowercase for case-insensitive comparison
        normalized = normalized.toLowerCase();

        // Step 2: Apply two-pointer logic
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== UC10: Case-Insensitive & Space-Ignored Palindrome Checker ===");
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

        sc.close();
    }
}