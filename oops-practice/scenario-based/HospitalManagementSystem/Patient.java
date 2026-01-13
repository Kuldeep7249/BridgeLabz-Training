package HospitalManagementSystem;

public class Patient extends Person {
    private String disease;

    public Patient(int id, String name, int age, String disease) {
        super(id, name, age);
        this.disease = disease;
    }

    @Override
    public double calculateFee() {
        return 200; // base consultation fee
    }
}
