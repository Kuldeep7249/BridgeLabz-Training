
import java.util.*;
import java.time.*;

class Policy {
    String number;
    String holder;
    LocalDate expiry;

    Policy(String n, String h, LocalDate e) {
        number = n;
        holder = h;
        expiry = e;
    }

    public String toString() {
        return number + " " + holder + " " + expiry;
    }
}

public class InsuranceSystem {
    public static void main(String[] args) {
        Map<String, Policy> map = new HashMap<>();
        map.put("P1", new Policy("P1","Alice", LocalDate.now().plusDays(10)));
        map.put("P2", new Policy("P2","Bob", LocalDate.now().plusDays(40)));
        map.put("P3", new Policy("P3","Alice", LocalDate.now().minusDays(1)));

        System.out.println(map.get("P1"));

        for (Policy p : map.values())
            if (!p.expiry.isAfter(LocalDate.now().plusDays(30)))
                System.out.println(p);

        for (Policy p : map.values())
            if (p.holder.equals("Alice"))
                System.out.println(p);

        map.values().removeIf(p -> p.expiry.isBefore(LocalDate.now()));
        System.out.println(map);
    }
}
