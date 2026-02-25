import java.util.Scanner;
import java.util.Stack;

// Palindrome Service Class (Encapsulation)
class PalindromeChecker {

    // Public method exposed to user
    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        // Normalize string (remove spaces & make lowercase)
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Using Stack (Internal Data Structure)
        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (int i = 0; i < normalized.length(); i++) {
            stack.push(normalized.charAt(i));
        }

        // Compare characters while popping
        for (int i = 0; i < normalized.length(); i++) {
            if (normalized.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Main Application Class
public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== UC11: Object-Oriented Palindrome Checker ===");
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Create service object
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

        sc.close();
    }
}