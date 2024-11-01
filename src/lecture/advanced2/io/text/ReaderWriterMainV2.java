package lecture.advanced2.io.text;

import java.io.*;
import java.util.Arrays;

import static java.nio.charset.StandardCharsets.UTF_8;
import static lecture.advanced2.io.text.TextConst.FILE_NAME;

public class ReaderWriterMainV2 {
    public static void main(String[] args) throws IOException {
        String text = "ABC";
        System.out.println("text = " + text);

        try (FileOutputStream fos = new FileOutputStream(FILE_NAME);
             OutputStreamWriter osw = new OutputStreamWriter(fos, UTF_8)) {
            osw.write(text);
        }

        try (FileInputStream fis = new FileInputStream(FILE_NAME);
             InputStreamReader isr = new InputStreamReader(fis, UTF_8)) {
            StringBuilder content = new StringBuilder();
            int ch;
            while ((ch = isr.read()) != -1) {
                content.append((char) ch);
            }
            System.out.println("content = " + content);
        }
    }
}
