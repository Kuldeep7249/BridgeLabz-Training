import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
 class ExtractLanguage {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        String text =r.nextLine();

        String regex = "(Java|Python|JavaScript)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);


        while (matcher.find()) {
            System.out.println("Found WORD: " + matcher.group());
        }
    }
}