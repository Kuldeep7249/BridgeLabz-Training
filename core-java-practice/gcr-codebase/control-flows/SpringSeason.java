import java.util.*;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int month = r.nextInt();
        int day = r.nextInt();

        boolean isSpring =
                (month == 3 && day >= 20) ||
                (month == 4) ||
                (month == 5) ||
                (month == 6 && day <= 20);

        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
        r.close();
    }
}
