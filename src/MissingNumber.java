/*
Given an array containing n distinct numbers taken from 0, 1, 2, …, n, find the one that is missing from the array.

To find the missing number in an array containing distinct numbers taken from 0 to n,
you can utilize the concept of arithmetic progression and Gauss’s formula.
 */

public class MissingNumber {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,8,6};
        int missingNumber = findMissingNumber(array);

        System.out.println(missingNumber);
    }
    public static int findMissingNumber(int[] array){
        int arrayLength = array.length + 1;

        int arraySum = 0;

        for(int i: array){
            arraySum += i;
        }

        int totalSum = arrayLength*(arrayLength+1)/2; // n(n+1)/2

        int missingNumber = totalSum - arraySum;

        return missingNumber;
    }

}
