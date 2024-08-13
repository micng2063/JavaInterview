// Show an example of switch expressions and multi-label case statements in Java.
//
// The switch expressions were added as a standard feature in Java 14.
// The following examples show switch expressions as well as multi-label case statements:

public class SwitchCase {
    public static void main(String[] args){
        int choice = 3;

        int x  = switch(choice){
            case 1, 2, 3:
                yield choice;
            default:
                yield -1;
        };

        System.out.println("x = " + x);

        String day = "Th";
        String result = switch (day) {
            case "M", "W", "F" -> "MWF";
            case "T", "Th", "S" -> "TTS";

            default -> {
                if (day.isEmpty()){
                    yield "Please insert a valid day.";
                }
                else
                    yield "Looks like a Sunday.";
            }
        };

        System.out.println(result);
    }
}
