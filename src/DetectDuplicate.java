/*
 Write a Java program to find all duplicate elements in an array.
To detect duplicate elements in an array in Java, you can use various approaches such as using a HashSet,
sorting the array, or using nested loops.
 */

import java.util.Map;
import java.util.HashMap;

public class DetectDuplicate {
    public static void main(String[] args){
        int[] array = {1,2,2,3,3,2,4};

        findDuplicate(array);
    }

    public static void findDuplicate(int[] array){

        Map<Integer,Integer> mapArray = new HashMap<>();

        for (int i : array){
            if (mapArray.containsKey(i)){
                mapArray.put(i, mapArray.get(i) + 1);
            }
            else{
                mapArray.put(i, 1);
            }
        }

        System.out.println(mapArray);

        for (Map.Entry<Integer, Integer> entry : mapArray.entrySet()){
            if (entry.getValue() > 1){
                System.out.println("Duplicate: " + entry.getKey() + " - Occurence: " + entry.getValue());
            }
        }

    }
}
