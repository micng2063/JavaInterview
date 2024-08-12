public class SwapTwoNumbers {
    public static void main(String[] args){
        int a = 10;
        int b = 5;

        System.out.println("a : " + a + " \t b: " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a : " + a + " \t b: " + b);
    }
}
