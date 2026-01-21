package generics.ResumeScreeningSystem;

public class ProductManager extends JobRole {

    ProductManager(String candidateName) {
        super(candidateName);
    }

    void screen() {
        System.out.println(candidateName + " screened for Product Manager role");
    }
}
