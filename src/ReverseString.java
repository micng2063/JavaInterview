/*
 Write a Java program to reverse a given string without using any built-in functions or libraries.
 */

public class ReverseString {
    public static void main(String[] args){
        String input = "Hello  world";

        StringBuilder output = new StringBuilder();

        char[] charInput = input.toCharArray();

        for (int i = charInput.length - 1; i >= 0; i--){
            output.append(charInput[i]);
        }

        System.out.println(output.toString());
    }
}
