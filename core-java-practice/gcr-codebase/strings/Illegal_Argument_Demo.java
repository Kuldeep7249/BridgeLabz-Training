import java.util.Scanner;

public class Illegal_Argument_Demo {
    public static void main(String[] args) {

        Scanner r = new Scanner(System.in);
        String text = r.next();

        generateException(text);
        handleException(text);

        r.close();
    }

    static void generateException(String s) {
        System.out.println(s.substring(5, 2));
    }

    static void handleException(String s) {
        try {
            System.out.println(s.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}
