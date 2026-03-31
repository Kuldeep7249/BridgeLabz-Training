import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.example.TemperatureConverter;
class TemperatureConverterTest {

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32, TemperatureConverter.celsiusToFahrenheit(0), 0.001);
        assertEquals(212, TemperatureConverter.celsiusToFahrenheit(100), 0.001);
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0, TemperatureConverter.fahrenheitToCelsius(32), 0.001);
        assertEquals(100, TemperatureConverter.fahrenheitToCelsius(212), 0.001);
    }
}
