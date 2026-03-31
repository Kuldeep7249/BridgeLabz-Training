import java.util.*;

public class ArrayExceptionDemo {

    static void printValueAtIndex(int[] arr, int index) {
        try {
            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter array size: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter array elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter index to retrieve value: ");
            int index = sc.nextInt();

            printValueAtIndex(arr, index);

        } finally {
            sc.close();
        }
    }
}
