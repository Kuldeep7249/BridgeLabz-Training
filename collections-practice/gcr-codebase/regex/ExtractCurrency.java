import java.util.*;
import java.util.regex.*;
 class ExtractCurrency {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        String text =r.nextLine();

        // String regex = "[$]*[0-9]+[.]*[0-9]*";
        String regex="[$]*(\\d)+[.](\\d)+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);


        while (matcher.find()) {
            System.out.println("Found WORD: " + matcher.group());
        }
    }
}
