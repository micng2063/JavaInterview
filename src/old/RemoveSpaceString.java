// How do you remove spaces from a string in Java?
// The following example code shows one way to remove spaces from a string using with the Character.isWhitespace() method:

public class RemoveSpaceString {
    public static void main(String[] args){
        String str = "A white fox";

        System.out.println(removeWhiteSpace(str));
    }

    public static String removeWhiteSpace(String input){
        StringBuilder output = new StringBuilder();

        char[] charOutput = input.toCharArray();

        for (char c: charOutput){
            if (!Character.isWhitespace(c)){
                output.append(c);
            }
        }

        return output.toString();
    }

    /*
    public static String removeWhiteSpace(String input){
        StringBuilder output = new StringBuilder();

        char[] charArray = input.toCharArray();

        for (char c: charArray){
            if (!Character.isWhitespace(c)){
                output.append(c);
            }
        }

        return output.toString();
    }
     */
}
