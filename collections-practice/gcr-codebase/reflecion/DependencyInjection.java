import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Inject {}

class Service {
    void serve() { System.out.println("Service"); }
}

class Client {
    @Inject
    Service service;
}

public class DependencyInjection {
    public static void main(String[] args) throws Exception {
        Client c = new Client();
        for (Field f : c.getClass().getDeclaredFields()) {
            if (f.isAnnotationPresent(Inject.class)) {
                f.setAccessible(true);
                f.set(c, f.getType().getDeclaredConstructor().newInstance());
            }
        }
        c.service.serve();
    }
}