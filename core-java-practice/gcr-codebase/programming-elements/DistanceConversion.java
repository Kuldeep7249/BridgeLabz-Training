import java.util.*;

public class DistanceConversion {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        double distanceInFeet = r.nextDouble();

        double yards = distanceInFeet / 3;
        double miles = yards / 1760;

        System.out.println("The distance in feet is " + distanceInFeet +
                " while in yards is " + yards +
                " and miles is " + miles);
        r.close();
    }
}
