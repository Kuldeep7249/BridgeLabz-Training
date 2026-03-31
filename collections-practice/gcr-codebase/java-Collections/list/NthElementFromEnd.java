import java.util.*;

public class NthElementFromEnd {

    static <T> T nthFromEnd(LinkedList<T> list, int n) {
        int fast = n;
        int slow = 0;
        while (fast < list.size()) {
            fast++;
            slow++;
        }
        return list.get(slow);
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        System.out.println(nthFromEnd(list, 3));
    }
}
