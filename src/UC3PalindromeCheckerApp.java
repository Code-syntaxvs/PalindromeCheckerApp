public class UC3PalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "racecar";
        System.out.println("Checking word: " + word);
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--)
        {
            reversed = reversed + word.charAt(i);
        }
        if (word.equals(reversed))
        {
            System.out.println("Result: \"" + word + "\" is a palindrome.");
        }
        else
        {
            System.out.println("Result: \"" + word + "\" is NOT a palindrome.");
        }
        System.out.println("Program finished.");
    }
}
