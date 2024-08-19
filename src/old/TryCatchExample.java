import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchExample {
    public static void main(String[] args){
        try {
            FileInputStream file = new FileInputStream("src/test.txt");
            System.out.println("Found");
        }
        catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
