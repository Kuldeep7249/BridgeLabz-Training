public class EmployeeManagementSystem {
    public static void main(String[]args){
        Employee e=new Employee("Kuldeep Singh",22,50000);
        e.displayDetails();
        Manager m = new Manager("Ravi Kumar", 23, 80000, 10);
        m.displayDetails();

        Developer d = new Developer("Anita Sharma", 24, 60000, "Java");
        d.displayDetails();

        Intern i = new Intern("Rahul Verma", 25, 20000);
        i.displayDetails();

    }
}
class Employee{
    private String name;
    private final int id;
    private int salary;

    public Employee(String name, int id ,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void displayDetails(){
        System.out.println(this.name);
        System.out.println(this.id);
        System.out.println(this.salary);
        System.out.println("-------------------------");
    }
}
class Manager extends Employee{
    private int teamSize;
    public Manager(String name, int id ,int salary,int teamSize){
        super(name,id,salary);
        this.teamSize=teamSize;
    }
     public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Manager");
        System.out.println("Team Size : "+teamSize);
        System.out.println("-------------------------");
    }


}
class Developer extends Employee{
    private String programmingLanguage;
    public Developer(String name, int id ,int salary,String programmingLanguage){
        super(name,id,salary);
        this.programmingLanguage=programmingLanguage;
    }
     public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Developer");
        System.out.println("programming language :"+programmingLanguage);
        System.out.println("-------------------------");
    }

}
class Intern extends Employee{
    public Intern(String name, int id ,int salary){
        super(name,id,salary);
    }
     public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Intern");
        System.out.println("-------------------------");
    }

}