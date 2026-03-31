import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        double first = r.nextDouble();
        double second = r.nextDouble();
        String op = r.next();

        switch (op) {
            case "+":
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                System.out.println("Result: " + (first * second));
                break;
            case "/":
                if (second != 0) {
                    System.out.println("Result: " + (first / second));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}
