package generics.ResumeScreeningSystem;
import java.util.*;

public class Resume<T extends JobRole> {

    List<T> resumes = new ArrayList<>();

    void addResume(T resume) {
        resumes.add(resume);
    }

    List<T> getResumes() {
        return resumes;
    }
}
