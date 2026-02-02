import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface RoleAllowed {
    String value();
}

@RoleAllowed("ADMIN")
class AdminService {
    void secure() {
        System.out.println("Admin Access");
    }
}

public class RoleAllowedDemo {
    public static void main(String[] args) {
        String role = "USER";
        RoleAllowed r = AdminService.class.getAnnotation(RoleAllowed.class);
        if (r.value().equals(role)) {
            new AdminService().secure();
        } else {
            System.out.println("Access Denied!");
        }
    }
}