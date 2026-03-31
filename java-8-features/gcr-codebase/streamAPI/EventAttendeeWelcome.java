import java.util.*;
public class EventAttendeeWelcome{
    public static void main(String[] args){
        List<String> attendees=List.of("A","B","C");
        attendees.forEach(a->System.out.println("Welcome "+a));
    }
}