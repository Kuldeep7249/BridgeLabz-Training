public class ZaraBonus {

    static double[][] generateEmployeeData(int n) {
        double[][] data = new double[n][2];
        for (int i = 0; i < n; i++) {
            data[i][0] = 10000 + (int)(Math.random() * 90000);
            data[i][1] = 1 + (int)(Math.random() * 10);
        }
        return data;
    }

    static double[][] calculateNewSalaryAndBonus(double[][] data) {
        int n = data.length;
        double[][] result = new double[n][2];
        for (int i = 0; i < n; i++) {
            double salary = data[i][0];
            double years = data[i][1];
            double bonus;
            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }
            result[i][0] = salary + bonus;
            result[i][1] = bonus;
        }
        return result;
    }

    static void calculateAndDisplayTotals(double[][] oldData, double[][] newData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Emp  OldSalary  Years  Bonus  NewSalary");

        for (int i = 0; i < oldData.length; i++) {
            double oldSalary = oldData[i][0];
            double years = oldData[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%3d  %9.0f  %5.0f  %6.0f  %9.0f%n",
                    i + 1, oldSalary, years, bonus, newSalary);
        }

        System.out.println("----------------------------------------");
        System.out.printf("     %9.0f        %6.0f  %9.0f%n",
                totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        double[][] employeeData = generateEmployeeData(10);
        double[][] updatedData = calculateNewSalaryAndBonus(employeeData);
        calculateAndDisplayTotals(employeeData, updatedData);
    }
}
