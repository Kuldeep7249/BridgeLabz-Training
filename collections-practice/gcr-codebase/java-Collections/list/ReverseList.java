import java.util.*;

public class ReverseList {

    static <T> void reverseArrayList(ArrayList<T> list) {
        int i = 0, j = list.size() - 1;
        while (i < j) {
            T temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }

    static <T> void reverseLinkedList(LinkedList<T> list) {
        int i = 0, j = list.size() - 1;
        while (i < j) {
            T temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        reverseArrayList(a);
        System.out.println(a);

        LinkedList<Integer> l = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        reverseLinkedList(l);
        System.out.println(l);
    }
}
