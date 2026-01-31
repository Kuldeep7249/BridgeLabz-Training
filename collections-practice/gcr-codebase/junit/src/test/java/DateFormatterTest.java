import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.example.DateFormatter;
class DateFormatterTest {

    @Test
    void testValidDate() {
        assertEquals("31-01-2024", DateFormatter.formatDate("2024-01-31"));
        assertEquals("01-12-2023", DateFormatter.formatDate("2023-12-01"));
    }

    @Test
    void testInvalidDate() {
        assertNull(DateFormatter.formatDate("31-01-2024"));
        assertNull(DateFormatter.formatDate("2024/01/31"));
        assertNull(DateFormatter.formatDate("invalid-date"));
    }
}
