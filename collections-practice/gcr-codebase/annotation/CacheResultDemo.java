import java.lang.annotation.*;
import java.util.*;

@Retention(RetentionPolicy.RUNTIME)
@interface CacheResult {}

class Calculator {
    Map<Integer,Integer> cache = new HashMap<>();

    @CacheResult
    int square(int x) {
        if (cache.containsKey(x)) return cache.get(x);
        int r = x * x;
        cache.put(x, r);
        return r;
    }
}

public class CacheResultDemo {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.square(5));
        System.out.println(c.square(5));
    }
}