import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface ImportantMethod {
    String level() default "HIGH";
}

class Demo {
    @ImportantMethod
    void a() {}

    @ImportantMethod(level="LOW")
    void b() {}
}

public class ImportantMethodDemo {
    public static void main(String[] args) {
        for (Method m : Demo.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(ImportantMethod.class)) {
                System.out.println(m.getName() + " " + m.getAnnotation(ImportantMethod.class).level());
            }
        }
    }
}