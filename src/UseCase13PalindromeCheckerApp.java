import java.util.Scanner;
import java.util.Stack;

public class UseCase13PalindromeCheckerApp {

    // -------------------------------
    // 1. Iterative Two-Pointer Method
    // -------------------------------
    public static boolean iterativeCheck(String input) {

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

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

    // -------------------------------
    // 2. Recursive Method
    // -------------------------------
    public static boolean recursiveCheck(String str, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return recursiveCheck(str, start + 1, end - 1);
    }

    public static boolean recursiveWrapper(String input) {
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        return recursiveCheck(normalized, 0, normalized.length() - 1);
    }

    // -------------------------------
    // 3. Stack-Based Method
    // -------------------------------
    public static boolean stackCheck(String input) {

        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char ch : normalized.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : normalized.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // -------------------------------
    // Main Method
    // -------------------------------
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== UC13: Performance Comparison of Palindrome Algorithms ===");
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Iterative Timing
        long startTime = System.nanoTime();
        boolean result1 = iterativeCheck(input);
        long endTime = System.nanoTime();
        long iterativeTime = endTime - startTime;

        // Recursive Timing
        startTime = System.nanoTime();
        boolean result2 = recursiveWrapper(input);
        endTime = System.nanoTime();
        long recursiveTime = endTime - startTime;

        // Stack Timing
        startTime = System.nanoTime();
        boolean result3 = stackCheck(input);
        endTime = System.nanoTime();
        long stackTime = endTime - startTime;

        // Display Results
        System.out.println("\n--- Results ---");
        System.out.println("Iterative Method Result : " + result1);
        System.out.println("Recursive Method Result : " + result2);
        System.out.println("Stack Method Result     : " + result3);

        System.out.println("\n--- Execution Time (in nanoseconds) ---");
        System.out.println("Iterative Method Time : " + iterativeTime);
        System.out.println("Recursive Method Time : " + recursiveTime);
        System.out.println("Stack Method Time     : " + stackTime);

        sc.close();
    }
}
