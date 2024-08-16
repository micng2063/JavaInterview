// How do you print a date in specific format in Java?
// The following example code shows how to use the SimpleDateFormat class to format the date string:

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDate {
    public static void main(String[] args){
        String pattern = "MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String date = simpleDateFormat.format(new Date());
        System.out.println(date);

        /*
        String pattern = "MM-dd-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String date = simpleDateFormat.format(new Date());
        System.out.println(date);
         */
    }
}
