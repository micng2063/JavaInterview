// How do you check if a list of integers contains only odd numbers in Java?

import java.util.ArrayList;
import java.util.List;

public class CheckOddList {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);

        System.out.println(onlyOddNumber(list));
    }

    public static boolean onlyOddNumber(List<Integer> list){
        for (Integer i : list){
            if (i % 2 == 0){
                return false;
            }
        }
        return true;
    }
}
