import java.util.*;

public class TotalPurchasePrice {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        double unitPrice = r.nextDouble();
        int quantity = r.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice +
                " if the quantity " + quantity +
                " and unit price is INR " + unitPrice);
    }
}
