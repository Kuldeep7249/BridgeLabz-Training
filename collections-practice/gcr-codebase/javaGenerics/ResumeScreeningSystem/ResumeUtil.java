package generics.ResumeScreeningSystem;
import java.util.*;

public class ResumeUtil {

    // Generic Method
    static <T extends JobRole> void processResume(T role) {
        role.screen();
    }

    // Wildcard Method
    static void screenAll(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            role.screen();
        }
    }
}
