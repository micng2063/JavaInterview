// How do you find the second largest number in an array in Java?

// There are many ways to solve this problem. You can sort the array in natural ascending order and
// take the second last value. However, sorting is an expensive operation.
// You can also use two variables to find the second largest value in a single iteration

public class FindSecondLargestNumber {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5, 19, 24, 39, 100};

        System.out.println(find2ndHighest(array));
    }

    public static int find2ndHighest(int[] array){
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i: array){
            if (i > highest){
                secondHighest = highest;
                highest = i;
            }
            else if (i > secondHighest){
                secondHighest = i;
            }
        }

        return secondHighest;
    }

}
