import java.util.Scanner;
public class Employee_Bonus {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        double salary = r.nextDouble();
        int yearsOfService = r.nextInt();

        double bonus = 0;

        if (yearsOfService > 5) {
            bonus = salary * 0.05;
        }

        System.out.println("Bonus Amount: " + bonus);
        r.close();
    }
}
