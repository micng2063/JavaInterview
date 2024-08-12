// How do you check whether a string is a palindrome in Java?

// A palindrome string is the same string backwards or forwards.
// To check for a palindrome, you can reverse the input string and check if the result is equal to the input.

public class CheckPalindrome {
    public static void main(String[] args){
        String str = "12321";

        String str1 = "socks";
        String str2 = "bob";

        //System.out.println(isPalindrome(str));

        System.out.println(checkPalindrome(str1));
        System.out.println(checkPalindrome(str2));
    }

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

    public static boolean isPalindrome(String input){
        StringBuilder output = new StringBuilder();

        char[] chars = input.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--){
            output.append(chars[i]);
        }

        if (input.equals(output.toString())){
            return true;
        }

        return false;
    }
}
