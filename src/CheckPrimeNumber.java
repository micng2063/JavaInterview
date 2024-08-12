//  Write a Java program to check if the given number is a prime number.

// You can write a program to divide the given number n, by a number from 2 to n/2 and check the remainder.
// If the remainder is 0, then it’s not a prime number.
// The following example code shows one way to check if a given number is a Prime number:

public class CheckPrimeNumber {
    public static void main(String[] args){
        System.out.println(isPrimeNumber(13));
        System.out.println(isPrimeNumber(49));
    }

    public static boolean isPrimeNumber(int input){
        if (input == 0 || input == 1){
            return false;
        }

        if (input == 2){
            return true;
        }

        for (int i = 2; i <= input / 2; i++){
            if (input % i == 0){
                return false;
            }
        }
        return true;
    }
}
