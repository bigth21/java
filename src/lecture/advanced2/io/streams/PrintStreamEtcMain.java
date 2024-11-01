package lecture.advanced2.io.streams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class PrintStreamEtcMain {
    public static void main(String[] args) throws IOException {
        try (FileOutputStream fos = new FileOutputStream("temp/print.txt");
             PrintStream printStream = new PrintStream(fos)) {
            printStream.println("hello java!");
            printStream.println(10);
            printStream.println(true);
            printStream.printf("hello %s", "world");
        }
    }
}
