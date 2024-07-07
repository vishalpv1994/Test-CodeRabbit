import java.util.ArrayList;
import java.util.List;

public class SonarExample {

    private String unusedField;


    public void unusedParameterMethod(int unusedParameter) {

    }

    public double calculateSomething(double num1, double num2) {
        return num1 + num2;
    }

    
    public void magicNumbersMethod() {
        int hoursInDay = 24; // Magic number
        int daysInWeek = 7; // Magic number
        int hoursInWeek = hoursInDay * daysInWeek;
    }

    
    public void resourceLeak() {
        List<String> list = new ArrayList<>();
        // Missing list.close() or using try-with-resources
    }

   
    public int nullPointerIssue(String str) {
        if (str != null && str.length() > 0) {
            return str.length();
        }
        return 0;
    }

    
    public int insecureRandom() {
        return (int) (Math.random() * 100); // Insecure random number generation
    }

   
    public void loggingIssue() {
        System.out.println("Logging something...");
    }

    
    private void unusedPrivateMethod() {
        // No usage of this method anywhere in the class
    }

    
    public void complexMethod(int x, int y) {
        if (x > 0) {
            if (y > 0) {
                System.out.println("Both x and y are greater than zero.");
            } else {
                System.out.println("x is greater than zero, but y is not greater than zero.");
            }
        } else {
            System.out.println("x is not greater than zero.");
        }
    }
}
