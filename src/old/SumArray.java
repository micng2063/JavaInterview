// How do you get the sum of all elements in an integer array in Java?

// You can use a for loop to iterate over the array elements and add them to get the final sum:

public class SumArray {
    public static void main(String[] args){
        int[] array = {1,2,3};

        int sum = 0;

        for (int i : array){
            sum += i;
        }

        System.out.println(sum);

        /*
        int[] array = {1,2,3,4,5};

        int sum = 0;

        for (int i : array){
            sum += i;
        }

        System.out.println(sum);
         */
    }
}
