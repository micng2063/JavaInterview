// How do you swap two numbers without using a third variable in Java?

public class CheckVowelPresent {
    public static void main(String[] args){
        System.out.println(containVowel("Hello"));
        System.out.println(containVowel("TV"));
    }

    public static boolean containVowel(String input){
        return input.toLowerCase().matches(".*[aeiou].*");
    }

    /*
    public static boolean containVowel(String input){
        return input.toLowerCase().matches(".*[aeiou].*");
    }
     */
}
