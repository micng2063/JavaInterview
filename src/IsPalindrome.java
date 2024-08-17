/*
Write a Java program to check if a given string is a palindrome or not.

To check if a string is a palindrome in Java, you can compare characters from both ends of the string.
 */
public class IsPalindrome {
    public static void main(String[] args){
        String input1 = "Bob";
        String input2 = "hello";

        System.out.println(isPalindrome(input1));
        System.out.println(isPalindrome(input2));
    }

    public static boolean isPalindrome(String input){
        StringBuilder output = new StringBuilder();

        char[] charInput = input.toCharArray();

        for (int i = charInput.length - 1; i >= 0; i--){
            output.append(charInput[i]);
        }

        if (!input.equals(output.toString())){
            return false;
        }

        return true;
    }
}
