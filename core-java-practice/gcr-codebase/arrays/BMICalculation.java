import java.util.Scanner;

public class BMICalculation {
    public static void main(String[] args) {

        Scanner r = new Scanner(System.in);

        int n = r.nextInt();

        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            weight[i] = r.nextDouble();
            height[i] = r.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal";
            } else {
                status[i] = "Overweight";
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Height: " + height[i] +
                               " Weight: " + weight[i] +
                               " BMI: " + bmi[i] +
                               " Status: " + status[i]);
        }

        r.close();
    }
}
