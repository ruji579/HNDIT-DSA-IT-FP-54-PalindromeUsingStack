package BAT_IT_2022_P_54;

import java.util.Stack;

public class PalindromeUsingStack {
    
    // Function to check if a number is a palindrome using a stack
    public static boolean isPalindrome(int num) {
        // Convert the number to a string for easy iteration
        String numStr = Integer.toString(num);
        
        // Create a stack to store digits
        Stack<Character> stack = new Stack<>();
        
        // Push all digits of the number into the stack
        for (int i = 0; i < numStr.length(); i++) {
            stack.push(numStr.charAt(i));
        }
        
        // Compare digits with the number's original order
        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) != stack.pop()) {
                return false;  // If digits don't match, it's not a palindrome
            }
        }
        
        // If all digits match, the number is a palindrome
        return true;
    }
    
    public static void main(String[] args) {
        // Input number
        int num = 12321;
        
        // Check if the number is a palindrome
        if (isPalindrome(num)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
