import java.util.*;

public class SquareSide {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        double perimeter = r.nextDouble();
        double side = perimeter / 4;

        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}
