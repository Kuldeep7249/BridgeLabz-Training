import java.util.Scanner;

public class Number_Format_Demo {
    public static void main(String[] args) {

        Scanner r = new Scanner(System.in);
        String text = r.next();

        generateException(text);
        handleException(text);

        r.close();
    }

    static void generateException(String s) {
        int num = Integer.parseInt(s);
        System.out.println("Number is: " + num);
    }

    static void handleException(String s) {
        try {
            int num = Integer.parseInt(s);
            System.out.println("Number is: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}
