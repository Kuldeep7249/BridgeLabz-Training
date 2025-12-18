import java.util.*;
public class Final_discount {
    public static void main(String[] args) {
        int fee=125000;
        int discountPercentage=10;
        int discount=fee/discountPercentage;
        System.out.println("The discount amount is INR "+(discount)+" final discounted fee is INR "+(fee-discount));
    }
}
