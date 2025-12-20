import java.util.Scanner;

public class Abundant_number {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        int number = r.nextInt();
        int sum = 0;
12
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        if (sum > number) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not an Abundant Number");
        }
        r.close();
    }
}
