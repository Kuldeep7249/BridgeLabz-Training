package com.example.EmployeeWage;
import java.util.*;
public class EmployeeWage implements IEmployeeWage {

    public static final int IS_ABSENT = 0;
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOURS = 8;
    static final int PART_TIME_HOURS = 4;

    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_WORKING_HOURS = 100;

    Random random = new Random();
    public ArrayList<Integer> dailyWageList = new ArrayList<>();
    private ArrayList<CompanyEmpWage> companyList = new ArrayList<>();

    public int getAttendance() {
        return random.nextInt(2);
    }

    public int getDailyWage(int employeeType) {
        int workingHours;

        switch (employeeType) {
            case IS_FULL_TIME:
                workingHours = FULL_DAY_HOURS;
                break;
            case IS_PART_TIME:
                workingHours = PART_TIME_HOURS;
                break;
            default:
                workingHours = 0;
        }

        return workingHours * WAGE_PER_HOUR;
    }

    public void calculateMonthlyWage() {

        int totalDays = 0;
        int totalHours = 0;
        int totalSalary = 0;

        while (totalDays < MAX_WORKING_DAYS &&
                totalHours < MAX_WORKING_HOURS) {

            totalDays++;

            int employeeType = random.nextInt(3);
            int dailyWage = getDailyWage(employeeType);
            int hoursWorked = dailyWage / WAGE_PER_HOUR;

            totalHours += hoursWorked;
            totalSalary += dailyWage;
            dailyWageList.add(dailyWage);

            System.out.println("Day " + totalDays +
                    " | Hours: " + hoursWorked +
                    " | Wage: " + dailyWage);
        }

        System.out.println("Single Company Monthly Wage: " + totalSalary);
    }

    public void addCompany(String company, int wagePerHour,
                           int maxWorkingDays, int maxWorkingHours) {

        companyList.add(new CompanyEmpWage(company,
                wagePerHour, maxWorkingDays, maxWorkingHours));
    }

    public void computeWage() {

        for (CompanyEmpWage company : companyList) {

            int totalDays = 0;
            int totalHours = 0;

            while (totalDays < company.maxWorkingDays &&
                    totalHours < company.maxWorkingHours) {

                totalDays++;

                int employeeType = random.nextInt(3);
                int workingHours = 0;

                switch (employeeType) {
                    case IS_FULL_TIME:
                        workingHours = FULL_DAY_HOURS;
                        break;
                    case IS_PART_TIME:
                        workingHours = PART_TIME_HOURS;
                        break;
                    default:
                        workingHours = 0;
                }

                int dailyWage = workingHours * company.wagePerHour;

                totalHours += workingHours;
                company.dailyWageList.add(dailyWage);
            }

            int totalSalary = totalHours * company.wagePerHour;
            company.setTotalWage(totalSalary);

            System.out.println("Company: " + company.company);
            System.out.println("Daily Wages: " + company.dailyWageList);
            System.out.println("Total Wage: " + company.totalWage);
        }
    }

    public int getTotalWage(String companyName) {

        for (CompanyEmpWage company : companyList) {
            if (company.company.equals(companyName)) {
                return company.totalWage;
            }
        }
        return -1;
    }
}
