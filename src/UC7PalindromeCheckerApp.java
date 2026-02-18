import java.util.Deque;
import java.util.LinkedList;
public class UC7PalindromeCheckerApp
{
    public static void main(String[] args)
    {
        String word = "rotor";
        System.out.println("Checking word: " + word);
        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < word.length(); i++)
        {
            deque.add(word.charAt(i));
        }
        boolean isPalindrome = true;
        while (deque.size() > 1)
        {
            char front = deque.removeFirst();
            char rear = deque.removeLast();
            if (front != rear)
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

