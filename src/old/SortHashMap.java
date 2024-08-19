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

    // To sort a HashMap, convert it to a list of entries, sort the list by values or keys,
    // and then insert the sorted entries into a LinkedHashMap to maintain the sorted order.

    public static Map<String,Integer> sortByValue(Map<String,Integer> map){
        Map<String,Integer> sortedMap = new LinkedHashMap<>();

        Set<Entry<String,Integer>> entrySet = map.entrySet();
        List<Entry<String,Integer>> entryList = new ArrayList<>(entrySet);
        entryList.sort((x,y) -> (x.getValue().compareTo(y.getValue())));

        for (Entry<String,Integer> e: entryList){
            sortedMap.put(e.getKey(), e.getValue());
        }

        return sortedMap;
    }

}
