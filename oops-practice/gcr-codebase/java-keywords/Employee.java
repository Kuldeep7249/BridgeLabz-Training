public class Employee {
    private static String companyName = "Tech Solutions";
    private String name;
    private final int id;
    private String designation;
    private static int employeeCount = 0;
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        employeeCount++;
    }
    public static int getEmployeeCount() {
        return employeeCount;
    }
    public void displayEmployeeInfo() {
        if(this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
            System.out.println("---------------------------");
        }
        else{
            System.out.println("Not a valid instance");
        }
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 101, "Developer");
        Employee emp2 = new Employee("Bob", 102, "Manager");
        emp1.displayEmployeeInfo();
        emp2.displayEmployeeInfo();
        System.out.println("Total Employees: " + Employee.getEmployeeCount());
    }
}
