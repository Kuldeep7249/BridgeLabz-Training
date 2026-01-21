public class ExamCourse extends CourseType {
    private int marks;
    public ExamCourse(int marks){
        super("Exam Based Type");
        this.marks=marks;
    }
    public int getMarks(){
        return marks;
    }
    public void evaluate(){
        System.out.println("the total number sre : "+getMarks());
    }
}
