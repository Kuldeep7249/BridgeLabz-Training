import java.util.*;
public class EmailNotifications{
    static void sendEmailNotification(String e){
        System.out.println("Email sent to "+e);
    }
    public static void main(String[] args){
        List<String> emails=List.of("a@mail.com","b@mail.com");
        emails.forEach(e->sendEmailNotification(e));
    }
}