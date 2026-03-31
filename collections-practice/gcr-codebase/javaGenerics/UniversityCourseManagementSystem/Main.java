import java.util.*;

public class Main {
    public static void main(String[] args) {

        ExamCourse examBased = new ExamCourse(100);
        AssignmentCourse assignmentBased = new AssignmentCourse(5, 100);
        ResearchCourse researchBased =
            new ResearchCourse("Artificial Intelligence", true);

        Course<ExamCourse> dsa =
            new Course<>("CS101", "Data Structures", examBased);

        Course<AssignmentCourse> web =
            new Course<>("CS202", "Web Development", assignmentBased);

        Course<ResearchCourse> ai =
            new Course<>("CS303", "AI Research", researchBased);

        dsa.evaluateCourse();
        web.evaluateCourse();
        ai.evaluateCourse();

        List<CourseType> evaluations = new ArrayList<>();
        evaluations.add(examBased);
        evaluations.add(assignmentBased);
        evaluations.add(researchBased);

        Department csDepartment = new Department("Computer Science");
        csDepartment.evaluateCourses(evaluations);
    }
}
