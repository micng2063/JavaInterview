// How do you get distinct characters and their count in a string in Java?

// You can create the character array from the string.
// Then iterate over it and create a HashMap with the character as key and their count as value.
// The following example code shows how to extract and count the characters of a string:

public class RemoveCharacter {
    public static void main(String[] args){
        String str1 = "aBCEeeefagh";

        str1 = str1.replace("a", "A");

        System.out.println(str1);
    }
}
