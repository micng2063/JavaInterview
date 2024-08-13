// Write a Java program that sorts HashMap by value.

// HashMap is not an ordered collection.
// The following example code shows how to sort the entries based on value and store them into LinkedHashMap,
// which maintains the order of insertion

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortHashMap {
    public static void main(String[] args){
        Map<String, Integer> scores = new HashMap<>();

        scores.put("David", 85);
        scores.put("Jane", 81);
        scores.put("Lisa", 90);

        System.out.println(scores);

        scores = sortByValue(scores);
        System.out.println(scores);
    }

    public static Map<String, Integer> sortByValue(Map<String, Integer> scores){
        Map<String, Integer> sortedByValue = new LinkedHashMap<>();

        Set<Entry<String, Integer>> entrySet = scores.entrySet();
        System.out.println(entrySet + "\t Get entry set");

        List<Entry<String,Integer>> entryList = new ArrayList<>(entrySet);
        System.out.println(entryList + "\t Create list since set is unordered: ");

        entryList.sort((x,y) -> x.getValue().compareTo(y.getValue()));
        System.out.println(entryList + "\t Sort list by value: ");

        for(Entry<String,Integer> e: entryList){
            sortedByValue.put(e.getKey(), e.getValue());
        }

        return sortedByValue;
    }
}
