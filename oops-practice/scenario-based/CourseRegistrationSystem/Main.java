package CourseRegistrationSystem;

public class Main {
    public static void main(String[] args) {
        Student student=new Student(1,"Kuldeep Singh");
        RegistrationService service=new StudentRegistrationSystem();
        Course c1 = new Course("CS101", "Data Structures");
        Course c2 = new Course("CS102", "Operating Systems");
        Course c3 = new Course("CS103", "DBMS");
        Course c4 = new Course("CS104", "Computer Networks");
        try {
            service.register(student, c1);
            service.register(student, c2);
            service.register(student, c3);
            service.register(student, c4); // Exception here
        } catch (CourseLimitExceedException e) {
            System.out.println("Error: " + e.getMessage());
        }

        student.addGrade("CS101", "A");
        student.addGrade("CS102", "B+");

        student.displayInfo();
        student.viewGrades();
        student.viewEnrolledCourse();
    }
}
