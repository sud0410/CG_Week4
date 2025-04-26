import java.io.*;

public class LargeFileReader {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("sudarsan_main.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains("nil/error")) {
                    System.out.println(line);
                }
            }
        }
    }
}
