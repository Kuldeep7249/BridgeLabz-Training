package generics.ResumeScreeningSystem;

public class DataScientist extends JobRole {

    DataScientist(String candidateName) {
        super(candidateName);
    }

    void screen() {
        System.out.println(candidateName + " screened for Data Scientist role");
    }
}
