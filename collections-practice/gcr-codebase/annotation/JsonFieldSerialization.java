import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface JsonField {
    String name();
}

class UserData {
    @JsonField(name="user_name")
    String name = "Kuldeep";
}

public class JsonFieldSerialization {
    public static void main(String[] args) throws Exception {
        UserData u = new UserData();
        StringBuilder sb = new StringBuilder("{");
        for (Field f : u.getClass().getDeclaredFields()) {
            JsonField j = f.getAnnotation(JsonField.class);
            if (j != null) {
                sb.append("\"").append(j.name()).append("\":\"").append(f.get(u)).append("\"");
            }
        }
        sb.append("}");
        System.out.println(sb);
    }
}