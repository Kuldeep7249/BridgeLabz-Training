import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface LogExecutionTime {}

class Work {
    @LogExecutionTime
    void job() {
        for(int i=0;i<1000000;i++);
    }
}

public class LogExecutionTimeDemo {
    public static void main(String[] args) throws Exception {
        Work w = new Work();
        Method m = Work.class.getDeclaredMethod("job");
        long s = System.nanoTime();
        m.invoke(w);
        long e = System.nanoTime();
        System.out.println(e - s);
    }
}