import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

class Project {
    @Todo(task="Login", assignedTo="Dev1")
    void login() {}

    @Todo(task="Payment", assignedTo="Dev2", priority="HIGH")
    void pay() {}
}

public class TodoAnnotation {
    public static void main(String[] args) {
        for (Method m : Project.class.getDeclaredMethods()) {
            Todo t = m.getAnnotation(Todo.class);
            if (t != null)
                System.out.println(t.task()+" "+t.assignedTo()+" "+t.priority());
        }
    }
}