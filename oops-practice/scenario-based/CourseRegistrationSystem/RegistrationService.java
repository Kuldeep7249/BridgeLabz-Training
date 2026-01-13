package CourseRegistrationSystem;

public abstract class RegistrationService {
    public abstract void register(Student s,Course c);
    public abstract void drop(Student s,Course c);
}
