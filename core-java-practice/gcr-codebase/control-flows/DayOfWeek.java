import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner r=new  Scanner(System.in);
        int m = r.nextInt();
        int d = r.nextInt();
        int y = r.nextInt();

        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int k = y % 100; // year of the century
        int j = y / 100; // zero-based century

        int f = d + (13 * (m + 1)) / 5 + k + k / 4 + j / 4 + 5 * j;
        int dayOfWeek = f % 7;

        int result = (dayOfWeek + 6) % 7;

        System.out.println(result);
        r.close();
    }
}
