public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};  // Missing number is 3
        int n = 6;  // Range is 1 to n

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing number is: " + missingNumber);
    }
}
