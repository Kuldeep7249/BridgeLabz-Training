public class CircularBuffer {
    int[] arr;
    int front = 0, size = 0, cap;

    CircularBuffer(int c) {
        cap = c;
        arr = new int[c];
    }

    void insert(int x) {
        arr[(front + size) % cap] = x;
        if (size < cap) size++;
        else front = (front + 1) % cap;
    }

    void display() {
        for (int i = 0; i < size; i++)
            System.out.print(arr[(front + i) % cap] + " ");
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.insert(4);
        cb.display();
    }
}