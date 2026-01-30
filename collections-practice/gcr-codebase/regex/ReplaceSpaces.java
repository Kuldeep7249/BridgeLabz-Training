import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 class Replacespaces {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        String text = r.nextLine();
        String regex = "\\s+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

       String t= matcher.replaceAll(" ");
        System.out.println(t);
    }
}
