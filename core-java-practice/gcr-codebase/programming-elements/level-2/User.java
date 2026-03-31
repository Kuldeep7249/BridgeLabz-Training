import java.util.*;

public class User {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int fee = r.nextInt();
        int discountPercentage = r.nextInt();
        int discount = fee / discountPercentage;
        System.out.println(
                "The discount amount is INR " + (discount) + " final discounted fee is INR " + (fee - discount));
        r.close();
    }
}
