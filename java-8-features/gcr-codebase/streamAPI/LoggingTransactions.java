import java.time.*;
import java.util.*;
public class LoggingTransactions{
    public static void main(String[] args){
        List<String> ids=List.of("TX1","TX2","TX3");
        ids.forEach(id->System.out.println(LocalDateTime.now()+" - Transaction: "+id));
    }
}