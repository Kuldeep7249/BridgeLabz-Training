import java.util.*;

public class Queue {
    int[] arr;
    int size;
    int index = 0;

    public Queue(int size) {
        this.size=size;
        this.arr = new int[size];
    }

    public void enqueue(int data) {
        arr[index++] = data;
    }

    public int deque() {
        int t = arr[0];
        for (int i = 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        index--;
        return t;
    }

    public int peek() {
        return arr[0];
    }

    public void print() {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(8);
        q.enqueue(1);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        System.out.println(q.deque());
        q.print();
        System.out.println(q.peek());
        q.print();
    }
}