import java.util.Scanner;

public class Array_Sum {

    public static void main(String[] args) {

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        Scanner r = new Scanner(System.in);

        while (true) {

            System.out.print("Enter a number");
            double input = r.nextDouble();

            if (input <= 0) {
                break;
            }

            if (index == 10) {
                break;
            }

            numbers[index] = input;
            index++;
        }
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total = total + numbers[i];
        }

        System.out.println("Total sum: " + total);

        r.close();
    }
}
