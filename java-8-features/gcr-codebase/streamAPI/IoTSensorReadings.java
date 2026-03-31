import java.util.*;
public class IoTSensorReadings{
    public static void main(String[] args){
        List<Integer> readings=List.of(20,45,60,30);
        readings.stream()
                .filter(r->r>40)
                .forEach(System.out::println);
    }
}