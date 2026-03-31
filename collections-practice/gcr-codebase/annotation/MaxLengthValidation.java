import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MaxLength {
    int value();
}

class User {
    @MaxLength(5)
    String username;

    User(String username) throws Exception {
        Field f = this.getClass().getDeclaredField("username");
        MaxLength m = f.getAnnotation(MaxLength.class);
        if (username.length() > m.value())
            throw new IllegalArgumentException();
        this.username = username;
    }
}

public class MaxLengthValidation {
    public static void main(String[] args) throws Exception {
        new User("Admin");
    }
}