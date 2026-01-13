package HospitalManagementSystem;

public class Main {
    public static void main(String[] args) {

        HospitalService service = new Service();

        Patient p1 = new Patient(1, "Rahul", 30, "Fever");
        Doctor d1 = new Doctor(101, "Dr. Sharma", 45, "General");

        service.addPatient(p1);
        service.addDoctor(d1);

        service.bookAppointment(p1, d1);
        service.cancelAppointment(p1, d1);
        service.viewAppointments();
    }
}
