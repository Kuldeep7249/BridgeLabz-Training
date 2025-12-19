import java.util.*;

public class Smallest_Among_Three_Number {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int number1 = r.nextInt();
        int number2 = r.nextInt();
        int number3 = r.nextInt();
        if (number1 < number2 && number1 < number3) {
            System.out.println("Yes " + number1 + " is smallest among Three numbers");
        } else {
            System.out.println("No" + number1 + " is not smallest among three numbers");
        }
        r.close();
    }
}
