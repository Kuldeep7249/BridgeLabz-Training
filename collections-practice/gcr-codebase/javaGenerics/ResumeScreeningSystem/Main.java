package generics.ResumeScreeningSystem;

public class Main {
    public static void main(String[] args) {

        Resume<SoftwareEngineer> seResumes = new Resume<>();
        seResumes.addResume(new SoftwareEngineer("Aryan"));

        Resume<DataScientist> dsResumes = new Resume<>();
        dsResumes.addResume(new DataScientist("Pankaj"));

        Resume<ProductManager> pmResumes = new Resume<>();
        pmResumes.addResume(new ProductManager("Shivani"));

        System.out.println("Individual Screening:");
        ResumeUtil.processResume(new SoftwareEngineer("Karan"));

        System.out.println("\nBulk Screening:");
        ResumeUtil.screenAll(seResumes.getResumes());
        ResumeUtil.screenAll(dsResumes.getResumes());
        ResumeUtil.screenAll(pmResumes.getResumes());
    }
}
