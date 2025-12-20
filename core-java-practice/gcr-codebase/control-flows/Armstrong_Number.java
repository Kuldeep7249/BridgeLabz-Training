import java.util.Scanner;
public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        int number = r.nextInt();

        int originalNumber = number;
        int sum = 0;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum = sum + (digit * digit * digit);
            originalNumber = originalNumber / 10;
        }

        if (sum == number) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
        r.close();
    }
}
