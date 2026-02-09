package FunctionalInterface.TemperatureAlert;
import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {

        // Threshold condn nd Predicate used to test condn
        Predicate<Double> isHighTemp = temp -> temp > 40.0;

        double currentTemp = 45.5;

        if (isHighTemp.test(currentTemp)) {
            System.out.println("High Temperature Alert!");
        } 
        else {
            System.out.println("Temperature is normal");
        }
    }
}
