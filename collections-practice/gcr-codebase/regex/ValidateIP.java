import java.util.*;

public class ValidateIP {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        String username = r.next();
        String regex = "^([0-255][.]){3}[0-255]$";

        if (username.matches(regex)) {
            System.out.println("Valid ");
        } else {
            System.out.println("Invalid ");
        }

    }
}
