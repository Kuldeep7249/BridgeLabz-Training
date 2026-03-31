import java.util.ArrayList;
import java.util.Random;

class Employee_Wage {

    static final int IS_ABSENT = 0;
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;

    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;

    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_WORKING_HOURS = 100;

    Random random = new Random();
    ArrayList<Integer> dailyWages = new ArrayList<>();

    public int checkAttendance() {
        return random.nextInt(2); 
    }

    public int calculateDailyWage(int empType) {
        int hoursWorked = 0;

        switch (empType) {
            case IS_FULL_TIME:
                hoursWorked = FULL_DAY_HOUR;
                break;

            case IS_PART_TIME:
                hoursWorked = PART_TIME_HOUR;
                break;

            default:
                hoursWorked = 0; // Absent
        }
        return hoursWorked * WAGE_PER_HOUR;
    }

    public void calculateMonthlyWage() {
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int totalSalary = 0;

        while (totalWorkingDays < MAX_WORKING_DAYS && totalWorkingHours < MAX_WORKING_HOURS) {

            totalWorkingDays++;
            int empType = random.nextInt(3); // 0,1,2

            int dailyWage = calculateDailyWage(empType);
            int hoursWorked = dailyWage / WAGE_PER_HOUR;

            totalWorkingHours += hoursWorked;
            totalSalary += dailyWage;

            dailyWages.add(dailyWage);

            System.out.println("Day " + totalWorkingDays + "  | Hours Worked: " + hoursWorked + "  | Daily Wage: " + dailyWage);
        }

        System.out.println("\nTotal Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Total Monthly Salary: " + totalSalary);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program\n");

        Employee_Wage employee = new Employee_Wage();

        // UC1: Attendance Check
        int attendance = employee.checkAttendance();
        if (attendance == 1) {
            System.out.println("Employee is Present");
        } 
        else {
            System.out.println("Employee is Absent");
        }

        System.out.println("\nCalculating Monthly Wages...\n");

        // UC4, UC5, UC6 Execution
        employee.calculateMonthlyWage();
    }
}