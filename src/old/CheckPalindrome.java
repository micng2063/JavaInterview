// How do you check whether a string is a palindrome in Java?

// A palindrome string is the same string backwards or forwards.
// To check for a palindrome, you can reverse the input string and check if the result is equal to the input.

public class CheckPalindrome {
    public static void main(String[] args){
        String str = "12321";

        String str1 = "bob";
        String str2 = "bobsa";

        //System.out.println(isPalindrome(str));

        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
    }

    public static boolean isPalindrome(String input){
        StringBuilder output = new StringBuilder();

        char[] charsArray = input.toCharArray();

        for (int i = charsArray.length - 1 ; i >= 0 ; i--){
            output.append(charsArray[i]);
        }

        if (!input.equals(output.toString())){
            return false;
        }

        return true;
    }

    /*
    public static boolean checkPalindrome(String input){
        boolean result = true;
        int length = input.length();

        for (int i = 0; i < length/2; i++){
            if (input.charAt(i) != input.charAt(length - i - 1)){
                result = false;
                break;
            }
        }
        return result;
    }
     */
}
