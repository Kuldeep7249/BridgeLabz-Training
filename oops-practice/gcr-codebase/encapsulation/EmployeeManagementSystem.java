interface Department {
    void assignDepartment(String department);
    void showDepartmentDetails();
}
abstract class Employee implements Department {
    private String name;
    private String id;
    private double salary;
    private String department;
    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
        System.out.println("---------------------------");
    }
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getDepartment() {
        return department;
    }
    
    public abstract void calculateSalary();
    public void assignDepartment(String department) {
        this.department = department;
    }
    public void showDepartmentDetails() {
        System.out.println("Employee " + getName() + " works in " + department + " department.");
    }
    
}
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, String id, double monthlySalary) {
        super(name, id, monthlySalary);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void calculateSalary() {
        setSalary(monthlySalary);
    }
}
class PartTimeEmployee extends Employee {
    private double hourlyWage;
    private int hoursWorked;

    public PartTimeEmployee(String name, String id, double hourlyWage, int hoursWorked) {
        super(name, id, hourlyWage * hoursWorked);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void calculateSalary() {
        setSalary(hourlyWage * hoursWorked);
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee("Alice", "FTE001", 5000);
        PartTimeEmployee pte = new PartTimeEmployee("Bob", "PTE001", 20, 80);
        fte.calculateSalary();
        pte.calculateSalary();
        fte.setSalary(5500); // Update salary for full-time employee
        fte.displayDetails();
        pte.displayDetails();
        fte.assignDepartment("Finance");
        fte.showDepartmentDetails();
        pte.assignDepartment("Customer Support");
        pte.showDepartmentDetails();
    }
}
