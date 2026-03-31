import java.util.*;

public class Volume_of_Earth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double vol = ((4 / 3) * (22 / 7) * r * r * r);
        System.out.println("The Volume of Earth in cubic kilometers is " + vol + " and cubic miles is" + (vol / 1.6));
        sc.close();
    }
}
