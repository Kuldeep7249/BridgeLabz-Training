import java.util.*;

public class ReverseQueue {
    static <T> void reverse(Queue<T> q) {
        if (q.isEmpty()) return;
        T x = q.remove();
        reverse(q);
        q.add(x);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(Arrays.asList(10,20,30));
        reverse(q);
        System.out.println(q);
    }
}