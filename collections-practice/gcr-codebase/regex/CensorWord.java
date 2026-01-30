import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 class CensorWord {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        String text = r.nextLine();
        String badWordsRegex = "\\b(damn|stupid)\\b";
        String result = text.replaceAll(badWordsRegex, "****");
        System.out.println(result);
    }
}
