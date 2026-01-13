package CourseRegistrationSystem;

public class StudentRegistrationSystem extends RegistrationService {

    @Override
    public void register(Student s,Course c) {
        s.enrollCourse(c);
    }

    @Override
    public void drop(Student s,Course c ) {
        s.dropCourse(c);
    }
}
