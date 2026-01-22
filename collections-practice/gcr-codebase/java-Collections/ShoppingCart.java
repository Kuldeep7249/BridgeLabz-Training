
import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        Map<String,Integer> prices = new HashMap<>();
        prices.put("Apple",50);
        prices.put("Banana",20);
        prices.put("Orange",30);

        Map<String,Integer> cart = new LinkedHashMap<>(prices);

        TreeMap<Integer,String> sorted = new TreeMap<>();
        for (Map.Entry<String,Integer> e : prices.entrySet())
            sorted.put(e.getValue(), e.getKey());

        System.out.println(cart);
        System.out.println(sorted);
    }
}
