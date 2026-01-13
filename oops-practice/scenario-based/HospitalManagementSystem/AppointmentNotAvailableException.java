package HospitalManagementSystem;

public class AppointmentNotAvailableException extends RuntimeException {
    public AppointmentNotAvailableException(String message) {
        super(message);
    }
}
