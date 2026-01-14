import java.util.*;

class CustomHashMap<K, V> {

    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity = 16;
    private Node<K, V>[] table;

    @SuppressWarnings("unchecked")
    CustomHashMap() {
        table = new Node[capacity];
    }

    private int index(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    public void put(K key, V value) {
        int idx = index(key);
        Node<K, V> head = table[idx];

        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        Node<K, V> node = new Node<>(key, value);
        node.next = table[idx];
        table[idx] = node;
    }

    public V get(K key) {
        int idx = index(key);
        Node<K, V> head = table[idx];

        while (head != null) {
            if (head.key.equals(key)) return head.value;
            head = head.next;
        }
        return null;
    }

    public void remove(K key) {
        int idx = index(key);
        Node<K, V> head = table[idx];
        Node<K, V> prev = null;

        while (head != null) {
            if (head.key.equals(key)) {
                if (prev == null) table[idx] = head.next;
                else prev.next = head.next;
                return;
            }
            prev = head;
            head = head.next;
        }
    }

    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        System.out.println(map.get("A"));
        map.remove("A");
        System.out.println(map.get("A"));
    }
}
