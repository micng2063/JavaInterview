// How can you find a string in a text file in Java?

// The following example code shows how to use the Scanner class to read the file contents line by line
// and then use the String contains() method to check if the string is present in the file

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class FindStringInFile {
    public static void main(String[] args){
        String filePath = "src/input.txt";
        String findString1 = "Maecenas vel interdum risus.";
        String findString2 = "Maecenas vel interdum risus False.";

        try {
            System.out.println(findStringInLine(filePath, findString1));
            System.out.println(findStringInLine(filePath, findString2));

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    public static boolean findStringInLine(String filePath, String str) throws FileNotFoundException{
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            if (line.contains(str)){
                scanner.close();
                return true;
            }
        }
        return false;
    }

    /*

    public static boolean findStringInLine(String filePath, String str) throws FileNotFoundException{
        File file = new File(filePath);

        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            if (line.contains(str)){
                scanner.close();
                return true;
            }
        }
        return false;
    }
     */

}
