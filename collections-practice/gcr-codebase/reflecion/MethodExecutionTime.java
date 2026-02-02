import java.lang.reflect.*;

class Task {
    public void run() {
        for(int i=0;i<1000000;i++);
    }
}

public class MethodExecutionTime {
    public static void main(String[] args) throws Exception {
        Method m = Task.class.getMethod("run");
        Object o = new Task();
        long s = System.nanoTime();
        m.invoke(o);
        long e = System.nanoTime();
        System.out.println(e - s);
    }
}