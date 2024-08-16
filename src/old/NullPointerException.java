// Write a Java program to show a NullPointerException.

// If you are calling a function on null, it will throw a NullPointerException
public class NullPointerException {
    public static void main(String[] args){
        printString(null, 3);
    }

    public static void printString(String input, int count){
        for (int i = 0; i < count; i++){
            System.out.println(input.toUpperCase());
        }
    }

    /*
    public static void printString(String s, int count){
        for (int i = 0; i < count; i++){
            System.out.println(s.toUpperCase());
        }
    }
     */
}
