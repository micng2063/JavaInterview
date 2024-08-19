import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args){
        List<String> fruit = new ArrayList<>();
        fruit.add("A");
        fruit.add("B");
        fruit.add("C");

        Iterator<String> itFruit = fruit.iterator();

        while (itFruit.hasNext()){
            System.out.println(itFruit.next());
        }

        fruit.forEach(System.out::println);

    }
}
