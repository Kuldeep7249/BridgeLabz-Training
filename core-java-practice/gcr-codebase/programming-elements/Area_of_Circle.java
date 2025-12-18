import java.util.Scanner;

public class Area_of_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double Area = 3.14 * radius*radius;
        System.out.println("Area of circle is "+Area);
    }
}
