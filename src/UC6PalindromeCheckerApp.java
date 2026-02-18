import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class UC6PalindromeCheckerApp
{
    public static void main(String[] args)
    {
        String word = "noon";
        System.out.println("Checking word: " + word);
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < word.length(); i++)
        {
            char ch = word.charAt(i);
            queue.add(ch);
            stack.push(ch);
        }
        boolean isPalindrome = true;
        while (!queue.isEmpty() && !stack.isEmpty())
        {
            char fromQueue = queue.remove();
            char fromStack = stack.pop();
            if (fromQueue != fromStack)
            {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome)
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
