import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        int year = r.nextInt();

        if (year < 1582) {
            System.out.println("Year is not valid");
            return;
        }

        boolean isLeap1;

        if (year % 400 == 0) {
            isLeap1 = true;
        } else if (year % 100 == 0) {
            isLeap1 = false;
        } else if (year % 4 == 0) {
            isLeap1 = true;
        } else {
            isLeap1 = false;
        }

        if (isLeap1) {
            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Year is not a Leap Year");
        }

        boolean isLeap2 = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeap2) {
            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Year is not a Leap Year");
        }
    }
}
