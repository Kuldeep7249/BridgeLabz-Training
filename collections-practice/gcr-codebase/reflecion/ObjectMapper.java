import java.lang.reflect.*;
import java.util.*;

public class ObjectMapper {
    public static <T> T toObject(Class<T> c, Map<String,Object> map) throws Exception {
        T obj = c.getDeclaredConstructor().newInstance();
        for (String k : map.keySet()) {
            Field f = c.getDeclaredField(k);
            f.setAccessible(true);
            f.set(obj, map.get(k));
        }
        return obj;
    }
}