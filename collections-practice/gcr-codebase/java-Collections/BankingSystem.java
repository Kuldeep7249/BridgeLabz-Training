
import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {
        Map<String,Integer> accounts = new HashMap<>();
        accounts.put("A1",5000);
        accounts.put("A2",2000);
        accounts.put("A3",8000);

        TreeMap<Integer,String> sorted = new TreeMap<>();
        for (Map.Entry<String,Integer> e : accounts.entrySet())
            sorted.put(e.getValue(), e.getKey());

        Queue<String> withdrawals = new LinkedList<>();
        withdrawals.add("A1");
        withdrawals.add("A2");

        while(!withdrawals.isEmpty())
            System.out.println("Processing " + withdrawals.remove());

        System.out.println(sorted);
    }
}
