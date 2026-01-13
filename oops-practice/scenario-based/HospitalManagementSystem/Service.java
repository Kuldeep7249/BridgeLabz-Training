package HospitalManagementSystem;

import java.util.*;

public class Service implements HospitalService {

    private List<Patient> patients = new ArrayList<>();
    private List<Doctor> doctors = new ArrayList<>();
    private List<Appointment> appointments = new ArrayList<>();

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }
    public void viewAppointments(){
        for(var a:appointments){
            System.out.println(
                    "Patient: " + a.patient.getName() +
                            ", Doctor: " + a.doctor.getName() +
                            ", Status: " + a.getStatus() +
                            ", Date: " + a.date
            );
        }
    }
    public void bookAppointment(Patient p, Doctor d) {
        Appointment appointment = new Appointment(p, d);
        appointments.add(appointment);
        System.out.println("Appointment booked successfully");
    }

    public void cancelAppointment(Patient p, Doctor d) {
        for (Appointment a : appointments) {
            if (a.getStatus().equals("BOOKED")) {
                a.cancel();
                System.out.println("Appointment cancelled");
                return;
            }
        }
        throw new AppointmentNotAvailableException("No active appointment found");
    }
}
