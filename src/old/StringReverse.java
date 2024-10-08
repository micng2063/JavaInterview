// 1. How do you reverse a string in Java?
// There is no reverse() utility method in the String class.
// However, you can create a character array from the string and then iterate it from the end to the start.
// You can append the characters to a string builder and finally return the reversed string.

public class StringReverse {
    public static void main(String[] args){
        String str = "123";

        System.out.println(reverseString(str));
    }

    public static String reverseString(String input){
        if (input == null){
            throw new IllegalArgumentException("Null is not valid input");
        }

        StringBuilder output = new StringBuilder();

        char[] charOutput = input.toCharArray();

        for (int i = charOutput.length - 1; i >= 0 ; i--){
            output.append(charOutput[i]);
        }

        return output.toString();
    }

}
