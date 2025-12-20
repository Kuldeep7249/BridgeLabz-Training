import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        double weight = r.nextDouble();
        double heightCm = r.nextDouble();

        double heightMeter = heightCm / 100;
        double bmi = weight / (heightMeter * heightMeter);

        String status;

        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal weight";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        System.out.println("BMI: " + bmi);
        System.out.println("Weight Status: " + status);
    }
}
