import java.lang.reflect.*;

public class JsonGenerator {
    public static String toJson(Object o) throws Exception {
        StringBuilder sb = new StringBuilder("{");
        Field[] f = o.getClass().getDeclaredFields();
        for (int i = 0; i < f.length; i++) {
            f[i].setAccessible(true);
            sb.append("\"").append(f[i].getName()).append("\":\"").append(f[i].get(o)).append("\"");
            if (i < f.length - 1) sb.append(",");
        }
        return sb.append("}").toString();
    }
}