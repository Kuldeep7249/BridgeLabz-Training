package com.example.EmployeeWage;
interface IEmployeeWage {
    void addCompany(String company, int wagePerHour,
                    int maxWorkingDays, int maxWorkingHours);

    void computeWage();

    int getTotalWage(String company);
}