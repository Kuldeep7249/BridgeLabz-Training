import java.util.*;
import java.io.*;

public class CheckedExceptions {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader(
                "C:\\Users\\kulde\\OneDrive\\Desktop\\BridgeLabz-Training\\collections-practice\\gcr-codebase\\javaStreams\\source.txt"
            );
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (IOException e) {
            System.out.println("File not Found");
        }
    }
}
