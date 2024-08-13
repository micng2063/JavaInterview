// Can you prove that a String object in Java is immutable programmatically?

// The following example code shows how to prove that a String object is immutable

public class ProveStringImmutable {
    public static void main(String[] args){
        String str1 = "Hello";
        String str2 = str1;

        System.out.println(str1.equals(str2));

        str1 = "Goodbye";

        System.out.println(str1.equals(str2));
        System.out.println(str1);
        System.out.println(str2);

    }
}
