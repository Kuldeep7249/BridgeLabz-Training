import java.util.List;

public class Department {

    private String departmentName;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public void evaluateCourses(List<? extends CourseType> courseTypes) {
        System.out.println("Department: " + departmentName);

        for (CourseType type : courseTypes) {
            type.evaluate();   
        }
    }
}
