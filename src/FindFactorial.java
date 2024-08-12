// How can you find the factorial of an integer in Java?

// The factorial of an integer is calculated by multiplying all the numbers from 1 to the given number:

public class FindFactorial {
    public static void main(String[] args){
        long integer = factorial(4);

        System.out.println(integer);
    }

    public static long factorial(long n){
        if (n == 1){
            return 1;
        }
        else
            return (n * factorial(n -1));
    }
}
