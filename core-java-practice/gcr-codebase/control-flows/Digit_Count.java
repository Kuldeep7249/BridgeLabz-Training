import java.util.Scanner;

public class Digit_Count {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        int number = r.nextInt();
        int count = 0;

        while (number != 0) {
            number = number / 10;
            count++;
        }

        System.out.println("Number of digits: " + count);
        r.close();
    }
}