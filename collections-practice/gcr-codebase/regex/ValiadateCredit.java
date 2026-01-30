import java.util.Scanner;

public class ValiadateCredit {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        String username = r.next();
        String regex = "^(4|5)[0-9]{15}$";

        if (username.matches(regex)) {
            System.out.println("Valid ");
        } else {
            System.out.println("Invalid ");
        }

    }
}
