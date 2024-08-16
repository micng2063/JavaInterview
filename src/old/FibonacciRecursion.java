// Write a Java program to print a Fibonacci sequence using recursion.
//
// A Fibonacci sequence is one in which each number is the sum of the two previous numbers.
// In this example, the sequence begins with 0 and 1.
// The following example code shows how to use a for loop to print a Fibonacci sequence:

public class FibonacciRecursion {
    public static void main(String[] args){
        // printFibonacci(10);

        /*
        int sequenceLength = 10;
        for (int i = 0; i < sequenceLength; i++){
            System.out.print(fibonacciRecursion(i) + " ");
        }
         */

        int sequenceLength = 4;
        for (int i = 0; i < sequenceLength; i++){
            System.out.print(fibonacciRecursion(i) + " ");
        }
    }

    public static int fibonacciRecursion(int i){
        if (i <= 1){
            return i;
        }

        return fibonacciRecursion(i - 1) + fibonacciRecursion(i -2);
    }

    /*

    public static void printFibonacci(int count){
        int a = 0;
        int b = 1;
        int c = 1;

        for (int i = 1; i <= count; i++){
            System.out.print(a + ",");
            a = b;
            b = c;
            c = a + b;
        }
    }

    public static int fibonacciRecursion(int count){
        if (count <= 1){
            return count;
        }
        return fibonacciRecursion(count -1) + fibonacciRecursion(count - 2);
    }
     */
}
