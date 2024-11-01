package lecture.advanced2.io.text;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

import static java.nio.charset.StandardCharsets.UTF_8;
import static lecture.advanced2.io.text.TextConst.FILE_NAME;

public class ReaderWriterMainV1 {
    public static void main(String[] args) throws IOException {
        String text = "ABC";
        byte[] bytes = text.getBytes(UTF_8);
        System.out.println("text = " + text);
        System.out.println("bytes = " + Arrays.toString(bytes));

        try (FileOutputStream fos = new FileOutputStream(FILE_NAME)) {
            fos.write(bytes);
        }

        try (FileInputStream fis = new FileInputStream(FILE_NAME)) {
            bytes = fis.readAllBytes();
            text = new String(bytes);
            System.out.println("bytes = " + Arrays.toString(bytes));
            System.out.println("text = " + text);
        }
    }
}
