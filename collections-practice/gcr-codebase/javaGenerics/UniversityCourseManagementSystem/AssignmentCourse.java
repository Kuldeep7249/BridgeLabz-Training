public class AssignmentCourse extends CourseType {

    private int totalAssignments;
    private int totalMarks;

    public AssignmentCourse(int totalAssignments, int totalMarks) {
        super("Assignment Based Evaluation");
        this.totalAssignments = totalAssignments;
        this.totalMarks = totalMarks;
    }

    @Override
    public void evaluate() {
        System.out.println(
            "Evaluating using " + totalAssignments +
            " assignments. Total Marks: " + totalMarks
        );
    }
}
