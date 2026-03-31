package com.example.EmployeeWage;
import java.util.ArrayList;

class CompanyEmpWage {

    
    String company;
    int wagePerHour;
    int maxWorkingDays;
    int maxWorkingHours;
    int totalWage;
    ArrayList<Integer> dailyWageList;

    CompanyEmpWage(String company, int wagePerHour,
                   int maxWorkingDays, int maxWorkingHours) {

        this.company = company;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
        this.dailyWageList = new ArrayList<>();
    }

    void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }
}
