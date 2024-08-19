// How do you get distinct characters and their count in a string in Java?
// You can create the character array from the string.
// Then iterate over it and create a HashMap with the character as key and their count as value.
// The following example code shows how to extract and count the characters of a string:

import java.util.Map;
import java.util.HashMap;

public class DistinctCharacterCount {
    public static void main(String[] args){

        String input = "javathehut";

        char[] chars = input.toCharArray();

        Map<Character,Integer> output = new HashMap<>();

        for (char c : chars){
            if (output.containsKey(c)){
                output.put(c, output.get(c) + 1);
            }
            else {
                output.put(c, 1);
            }
        }

        System.out.println(output);

    }
}
