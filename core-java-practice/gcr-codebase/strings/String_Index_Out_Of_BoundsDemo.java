import java.util.Scanner;

public class String_Index_Out_Of_BoundsDemo {
    public static void main(String[] args) {

        Scanner r = new Scanner(System.in);
        String text = r.next();

        generateException(text);
        handleException(text);

        r.close();
    }

    static void generateException(String s) {
        // This will throw StringIndexOutOfBoundsException
        System.out.println(s.charAt(s.length()));
    }

    static void handleException(String s) {
        try {
            System.out.println(s.charAt(s.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
