import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class ConsoleToFile {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fw = new FileWriter("output.txt");
        String line;

        while (true) {
            line = br.readLine();
            if (line.equals("exit")) {
                break;
            }
            fw.write(line + System.lineSeparator());
        }

        fw.close();
        br.close();
    }
}
