package CourseRegistrationSystem;

public class CourseLimitExceedException extends RuntimeException {
    public CourseLimitExceedException(String message) {
        super(message);
    }
}
