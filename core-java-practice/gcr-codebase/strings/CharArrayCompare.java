import java.util.Scanner;

public class CharArrayCompare {
    public static void main(String[] args) {

        Scanner r = new Scanner(System.in);

        String text = r.next();

        char[] userArray = getChars(text);
        char[] builtInArray = text.toCharArray();

        boolean result = compareArrays(userArray, builtInArray);

        if (result) {
            System.out.println("Both character arrays are equal");
        } else {
            System.out.println("Character arrays are not equal");
        }

        r.close();
    }

    static char[] getChars(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }

    static boolean compareArrays(char[] a, char[] b) {

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }
}
