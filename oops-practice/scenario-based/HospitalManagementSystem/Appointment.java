package HospitalManagementSystem;

import java.time.LocalDate;

public class Appointment {
    Patient patient;
    Doctor doctor;
    LocalDate date;
    private String status; // BOOKED / CANCELLED

    public Appointment(Patient patient, Doctor doctor) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = LocalDate.now();
        this.status = "BOOKED";
    }

    public void cancel() {
        this.status = "CANCELLED";
    }

    public String getStatus() {
        return status;
    }
}
