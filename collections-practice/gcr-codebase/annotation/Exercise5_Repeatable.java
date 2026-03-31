import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@interface BugReports {
    BugReport[] value();
}

class Service {
    @BugReport(description="Null pointer")
    @BugReport(description="Performance issue")
    void process() {}
}

public class Exercise5_Repeatable {
    public static void main(String[] args) throws Exception {
        Method m = Service.class.getDeclaredMethod("process");
        BugReport[] bugs = m.getAnnotationsByType(BugReport.class);
        for (BugReport b : bugs)
            System.out.println(b.description());
    }
}