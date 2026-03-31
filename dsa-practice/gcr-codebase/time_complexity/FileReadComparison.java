package time_complexity;
import java.io.*;

public class FileReadComparison {

    public static void main(String[] args) throws Exception {

        String filePath = "/Users/aryanchaturvedi/eclipse-workspace/dsa-practice/src/time_complexity/largeFile_10MB.txt"; // assume large file exists
        char[] buffer = new char[8192];

        // FileReader
        long start = System.nanoTime();
        FileReader fr = new FileReader(filePath);
        while (fr.read(buffer) != -1) {
            // reading file
        }
        fr.close();
        long end = System.nanoTime();
        System.out.println("FileReader Time: " + (end - start) / 1_000_000 + " ms");

        // InputStreamReader
        start = System.nanoTime();
        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath));
        while (isr.read(buffer) != -1) {
            // reading file
        }
        isr.close();
        end = System.nanoTime();
        System.out.println("InputStreamReader Time: " + (end - start) / 1_000_000 + " ms");
    }
}
