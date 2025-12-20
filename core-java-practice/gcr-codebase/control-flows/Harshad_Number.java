import java.util.Scanner;

public class Harshad_Number {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        int number = r.nextInt();
        int originalNumber = number;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }

        if (originalNumber % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }
        r.close();
    }
} 
