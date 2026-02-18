import java.util.Stack;
public class UC5PalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "radar";
        System.out.println("Checking word: " + word);
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }
        if (word.equals(reversed)) {
            System.out.println("Result: \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + word + "\" is NOT a palindrome.");
        }
        System.out.println("Program finished.");
    }
}
