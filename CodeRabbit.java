import java.util.ArrayList;
import java.util.List;

public class CodeRabbit {

    private static final String CONSTANT_VALUE = "constant";

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        String unusedVariable = "This variable is unused.";
   
        String nullString = null;
        if (nullString.equals("test")) {
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

        unusedPrivateMethod();

    }

    private static void unusedPrivateMethod() {
        // This method is unused
    }
}
