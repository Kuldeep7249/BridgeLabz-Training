import java.util.*;

public class Replace_method {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = r.nextLine();
        System.out.print("Enter the substring to replace: ");
        String target = r.nextLine();
        System.out.print("Enter the replacement substring: ");
        String replacement = r.nextLine();

        StringBuilder resultBuilder = new StringBuilder(); // Changed variable name to avoid conflict
        int targetLength = target.length();
        int i = 0;

        while (i < input.length()) {
            if (input.startsWith(target, i)) {
                resultBuilder.append(replacement);
                i += targetLength;
            } else {
                resultBuilder.append(input.charAt(i));
                i++;
            }
        }

        System.out.println("Modified string: " + resultBuilder.toString());
    }
}