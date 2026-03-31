public class CountingSort {
    public static void countingSort(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] > max) max = a[i];

        int[] count = new int[max + 1];
        for (int i = 0; i < a.length; i++)
            count[a[i]]++;

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                a[index++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {4, 2, 2, 8, 3, 3, 1};
        countingSort(a);
        for (int x : a) System.out.print(x + " ");
    }
}
