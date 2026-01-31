import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.example.PasswordValidator;
public class PasswordTest {
    @Test
    void test(){
        assertTrue(PasswordValidator.isValid("Kuldeep7249"));
        assertFalse(PasswordValidator.isValid("123ehska"));
    }
}
