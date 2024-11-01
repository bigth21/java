package lecture.advanced2.io.text;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static java.nio.charset.StandardCharsets.UTF_8;
import static lecture.advanced2.io.text.TextConst.FILE_NAME;

public class ReaderWriterMainV3 {
    public static void main(String[] args) throws IOException {
        String text = "ABC";
        System.out.println("text = " + text);

        try (FileWriter fw = new FileWriter(FILE_NAME, UTF_8)) {
            fw.write(text);
        }

        try (FileReader fr = new FileReader(FILE_NAME, UTF_8)) {
            StringBuilder content = new StringBuilder();
            int ch;
            while ((ch = fr.read()) != -1) {
                content.append((char) ch);
            }
            System.out.println("content = " + content);
        }
    }
}
