// Write Java program that checks if two arrays contain the same elements.

// To check if two arrays contain the same elements, you need to first create a set of elements from both the
// arrays, and then compare the elements in these sets to find if there is an element that is not present in
// both sets.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckArrayElement {
    public static void main(String[] args){
        Integer[] array1 = {1,2,3,2,1};
        Integer[] array2 = {1,2,3};
        Integer[] array3 = {1,2,3,4};

        System.out.println(sameElements(array1,array2));
        System.out.println(sameElements(array1,array3));
    }

    public static boolean sameElements(Object[] array1, Object[] array2){
        Set<Object> unique1 = new HashSet<>(Arrays.asList(array1));
        Set<Object> unique2 = new HashSet<>(Arrays.asList(array2));

        if (unique1.size() != unique2.size()){
            return false;
        }

        for (Object obj : unique1){
            if (!unique2.contains(obj)){
                return false;
            }
        }

        return true;
    }

    /*
    public static boolean sameElements(Object[] array1, Object[] array2){
        Set<Object> uniqueElement1 = new HashSet<>(Arrays.asList(array1));
        Set<Object> uniqueElement2 = new HashSet<>(Arrays.asList(array2));

        if (uniqueElement1.size() != uniqueElement2.size()){
            return false;
        }

        for (Object obj : uniqueElement1){
            if (!uniqueElement2.contains(obj)) {
                return false;
            }
        }
        return true;
    }
    */
}
