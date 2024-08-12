// How do you remove leading and trailing spaces from a string in Java?

// The String class contains two methods to remove leading and trailing whitespaces: trim() and strip().
// The strip() method uses the Character.isWhitespace() method to check if the character is a whitespace.
// This method uses Unicode code points, while the trim() method identifies any character with a codepoint value
// less than or equal to U+0020 as a whitespace character.
// The strip() method is the recommended way to remove whitespaces because it uses the Unicode standard.

public class RemoveLeadingSpace {
    public static void main(String[] args){
        String str = "        Something on the ground ";

        System.out.println(str);

        str = str.strip();

        System.out.println(str);
    }
}
