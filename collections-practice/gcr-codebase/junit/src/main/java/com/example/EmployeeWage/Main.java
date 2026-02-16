package com.example.EmployeeWage;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program\n");

        EmployeeWage employee = new EmployeeWage();

        System.out.println("========== UC 1 ==========");
        if (employee.getAttendance() == 1) {
            System.out.println("Employee is Present\n");
        } else {
            System.out.println("Employee is Absent\n");
        }

        System.out.println("========== UC 2–6 (Single Company) ==========");
        employee.calculateMonthlyWage();

        System.out.println("\n========== UC 8–13 (Multiple Companies) ==========");

        employee.addCompany("TCS", 20, 20, 100);
        employee.addCompany("Infosys", 25, 22, 120);
        employee.addCompany("Wipro", 30, 18, 110);

        employee.computeWage();

        System.out.println("\nQueried Total Wage for TCS: "
                + employee.getTotalWage("TCS"));
    }
}
