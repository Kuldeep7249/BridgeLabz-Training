package HospitalManagementSystem;

public interface HospitalService {
    void addPatient(Patient patient);
    void addDoctor(Doctor doctor);
    void bookAppointment(Patient patient, Doctor doctor);
    void cancelAppointment(Patient patient, Doctor doctor);
    void viewAppointments();
}
