import java.util.ArrayList;
import java.util.List;

public class CodeRabbit {

    private static final String CONSTANT_VALUE = "constant";

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        String var = "test";
   
        String str = null;
        if (str.equals("test")) {
            System.out.println("This won't be reached.");
        }

        for (String item : list) {
            System.out.println(item);
        }
        for (String item : list) {
            System.out.println(item);
        }

        String result = "";
        for (String item : list) {
            result += item + " ";
        }
        System.out.println("Result: " + result);

        System.out.println(CONSTANT_VALUE);

      
        try {
            // Some code that might throw an exception
        } catch (Exception e) {
            // Empty catch block
        }

        something();

    }

    private static void something() {
        // This method is unused
    }

    private static void something1() {
        // This method is unused
    }
}
