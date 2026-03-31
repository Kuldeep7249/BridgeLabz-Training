import java.util.*;
public class StockPriceLogger{
    public static void main(String[] args){
        List<Double> prices=List.of(120.5,121.3,119.8);
        prices.forEach(System.out::println);
    }
}