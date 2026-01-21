package generics.ResumeScreeningSystem;

public class SoftwareEngineer extends JobRole {

    SoftwareEngineer(String candidateName) {
        super(candidateName);
    }

    void screen() {
        System.out.println(candidateName + " screened for Software Engineer role");
    }
}
