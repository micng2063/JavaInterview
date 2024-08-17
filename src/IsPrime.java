/*
 Write a Java program to check if a given number is prime or not.
 */

public class IsPrime {
    public static void main(String[] args){
        System.out.println(isPrime(3));
        System.out.println(isPrime(2));;
        System.out.println(isPrime(12));
        System.out.println(isPrime(19));
        System.out.println(isPrime(16));
    }

    public static boolean isPrime(int num){
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;

        for (int i = 5 ; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }

        return true;
    }
}
