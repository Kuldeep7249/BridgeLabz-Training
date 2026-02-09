package FunctionalInterface.StringLengthChecker;
import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {

        // Function to calculate string length
        Function<String, Integer> lengthFunction = msg -> msg.length();
        
        String message = "Hello Java Functional Interface";
        int limit = 20;
        int length = lengthFunction.apply(message);

        if (length > limit) {
            System.out.println("Message exceeds character limit");
        } 
        else {
            System.out.println("Message is within character limit");
        }
    }
}
