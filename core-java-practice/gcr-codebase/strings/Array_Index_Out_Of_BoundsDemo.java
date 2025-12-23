import java.util.Scanner;

public class Array_Index_Out_Of_BoundsDemo {
    public static void main(String[] args) {

        Scanner r = new Scanner(System.in);

        String[] names = new String[3];
        for (int i = 0; i < names.length; i++) {
            names[i] = r.next();
        }

        generateException(names);
        handleException(names);

        r.close();
    }

    static void generateException(String[] arr) {
        // Accessing index beyond array length
        System.out.println(arr[5]);
    }

    static void handleException(String[] arr) {
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}
