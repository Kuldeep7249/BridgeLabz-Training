import java.util.Scanner;

public class Upper_case_Compare {
    public static void main(String[] args) {

        Scanner r = new Scanner(System.in);
        String text = r.nextLine();

        String upperCharAt = convertToUpperCharAt(text);
        String upperBuiltIn = text.toUpperCase();

        boolean result = compareStrings(upperCharAt, upperBuiltIn);

        if (result) {
            System.out.println("Both uppercase conversions are equal");
        } else {
            System.out.println("Conversions are not equal");
        }

        r.close();
    }

    static String convertToUpperCharAt(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }
            result += ch;
        }
        return result;
    }

    static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }
}
