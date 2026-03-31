import java.util.*;

class Employee {
    String name;
    String dept;

    Employee(String n, String d) {
        name = n;
        dept = d;
    }

    public String toString() {
        return name;
    }
}

public class GroupByDepartment {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
            new Employee("Alice","HR"),
            new Employee("Bob","IT"),
            new Employee("Carol","HR")
        );

        Map<String, List<Employee>> map = new HashMap<>();
        for (Employee e : list)
            map.computeIfAbsent(e.dept, k -> new ArrayList<>()).add(e);

        System.out.println(map);
    }
}