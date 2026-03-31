import java.util.Scanner;

public class Split {
    public static void main(String[] args) {

        Scanner r = new Scanner(System.in);
        String text = r.nextLine();

        int lengthWithoutMethod = getStringLength(text);
        int lengthWithMethod = text.length();

        System.out.println("Length without length(): " + lengthWithoutMethod);
        System.out.println("Length with length(): " + lengthWithMethod);
        String[] parts = text.split("_");
        System.out.println("Splitted parts:");
        for (String part : parts) {
            System.out.println(part);
        }

        r.close();
    }

    static int getStringLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return count;
    }
}
