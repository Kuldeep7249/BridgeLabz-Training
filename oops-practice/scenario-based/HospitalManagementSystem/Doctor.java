package HospitalManagementSystem;

public class Doctor extends Person {
    private String specialization;

    public Doctor(int id, String name, int age, String specialization) {
        super(id, name, age);
        this.specialization = specialization;
    }

    @Override
    public double calculateFee() {
        return 500; // higher fee for doctors
    }
}
