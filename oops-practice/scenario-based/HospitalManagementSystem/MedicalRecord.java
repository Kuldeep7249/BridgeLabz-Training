package HospitalManagementSystem;

public class MedicalRecord {
    private Patient patient;
    private String diagnosis;
    private String prescription;

    public MedicalRecord(Patient patient, String diagnosis, String prescription) {
        this.patient = patient;
        this.diagnosis = diagnosis;
        this.prescription = prescription;
    }
}
