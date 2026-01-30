import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class EmailExtractor {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        String text =r.nextLine();

        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);


        while (matcher.find()) {
            System.out.println("Found email: " + matcher.group());
        }
    }
}