public class SwapTwoNumbers {
    public static void main(String[] args){
        int a = 20;
        int b = 13;

        System.out.println(a + " " + b);
        a += b; // a = 15
        b = a - b; // b = 15 - 5 = 10 = a
        a = a - b; // a = 15- 10 = 5

        System.out.println(a + " " + b);

    }
}
