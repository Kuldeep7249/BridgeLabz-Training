import java.util.Scanner;

public class BMIMultiArray {
    public static void main(String[] args) {

        Scanner r = new Scanner(System.in);

        int number = r.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            double w = r.nextDouble();
            double h = r.nextDouble();

            if (w <= 0 || h <= 0) {
                System.out.println("Enter positive values");
                i--;
            } else {
                personData[i][0] = w;
                personData[i][1] = h;
            }
        }

        for (int i = 0; i < number; i++) {
            personData[i][2] = personData[i][0] /
                               (personData[i][1] * personData[i][1]);

            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                weightStatus[i] = "Normal";
            } else {
                weightStatus[i] = "Overweight";
            }
        }

        for (int i = 0; i < number; i++) {
            System.out.println("Height: " + personData[i][1] +
                               " Weight: " + personData[i][0] +
                               " BMI: " + personData[i][2] +
                               " Status: " + weightStatus[i]);
        }

        r.close();
    }
}
5
