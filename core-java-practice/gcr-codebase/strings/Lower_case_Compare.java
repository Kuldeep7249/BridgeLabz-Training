import java.util.Scanner;

public class Lower_case_Compare {
    public static void main(String[] args) {

        Scanner r = new Scanner(System.in);
        String text = r.nextLine();

        String lowerCharAt = convertToLowerCharAt(text);
        String lowerBuiltIn = text.toLowerCase();

        boolean result = compareStrings(lowerCharAt, lowerBuiltIn);

        if (result) {
            System.out.println("Both lowercase conversions are equal");
        } else {
            System.out.println("Conversions are not equal");
        }

        r.close();
    }

    static String convertToLowerCharAt(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
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
