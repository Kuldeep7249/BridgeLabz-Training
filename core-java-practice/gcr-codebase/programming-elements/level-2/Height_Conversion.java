import java.util.*;
public class Height_Conversion {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int c=r.nextInt();
        double in = c / 2.54;
        int f = (int) (in / 12);
        double inches = in % 12;
        System.out.println(" Your Height in cm is "+c+ " while in feet is "+f+ " and inches is "+inches);
    }
}
