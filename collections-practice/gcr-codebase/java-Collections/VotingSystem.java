
import java.util.*;

public class VotingSystem {
    public static void main(String[] args) {
        Map<String,Integer> votes = new HashMap<>();
        votes.put("Alice",3);
        votes.put("Bob",5);
        votes.put("Carol",2);

        Map<String,Integer> insertion = new LinkedHashMap<>(votes);
        Map<String,Integer> sorted = new TreeMap<>(votes);

        System.out.println(insertion);
        System.out.println(sorted);
    }
}
