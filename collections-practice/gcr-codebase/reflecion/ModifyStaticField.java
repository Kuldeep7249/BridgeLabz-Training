import java.lang.reflect.*;

class Configuration {
    private static String API_KEY = "OLD";
}

public class ModifyStaticField {
    public static void main(String[] args) throws Exception {
        Field f = Configuration.class.getDeclaredField("API_KEY");
        f.setAccessible(true);
        f.set(null, "NEW");
        System.out.println(f.get(null));
    }
}