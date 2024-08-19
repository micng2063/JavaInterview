// How do you sort an array in Java?
// The Arrays utility class has many overloaded sort() methods to sort primitive and to object arrays.
// If you are sorting a primitive array in the natural order, then you can use the Arrays.sort() method.

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args){
        int[] array = {1,2,3,-5,6,4,13,0};

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

    }
}
