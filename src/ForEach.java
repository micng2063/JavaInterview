import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        Iterator<String> it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        list.forEach(System.out::println);
    }
}
