import java.util.*;

public class ValidateUserName {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        String username = r.next();
        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";

        if (username.matches(regex)) {
            System.out.println("Valid username");
        } else {
            System.out.println("Invalid username");
        }

    }
}
