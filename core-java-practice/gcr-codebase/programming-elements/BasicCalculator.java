import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        double number1 = r.nextDouble();
        double number2 = r.nextDouble();

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "
                + number1 + " and " + number2 + " is "
                + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
        r.close();
    }
}
