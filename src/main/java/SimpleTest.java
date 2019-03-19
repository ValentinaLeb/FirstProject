import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SimpleTest {
    public static void main(String[] args) throws IOException {

        for (String line : Files.readAllLines(Paths.get("src/main/resources/History.txt"))) {
            System.out.println(line);
        }

    }
}
