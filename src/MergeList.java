//  How do you merge two lists in Java?

// The following example code shows how to use the addAll() method to merge multiple lists in Java:

import java.util.ArrayList;

public class MergeList {
    public static void main(String[] args){
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Hi");
        list1.add("Hello");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Goodbye");

        ArrayList<String> listMerged = new ArrayList<>(list1);
        listMerged.addAll(list2);
        System.out.println(listMerged);
    }
}
