// How do you shuffle an array in Java?

// The following example code shows how to use the Random class to generate random index numbers
// and shuffle the elements

import java.util.Random;
import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5, 6};

        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            int randomIndex = random.nextInt(array.length);
            int tempValue = array[randomIndex];
            array[randomIndex] = array[i];
            array[i] = tempValue;
        }

        System.out.println(Arrays.toString(array));
    }
}
