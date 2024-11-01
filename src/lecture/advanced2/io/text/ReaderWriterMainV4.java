package lecture.advanced2.io.text;

import java.io.*;

import static java.nio.charset.StandardCharsets.UTF_8;
import static lecture.advanced2.io.text.TextConst.FILE_NAME;

public class ReaderWriterMainV4 {
    private static final int BUFFER_SIZE = 8192;

    public static void main(String[] args) throws IOException {
        String output = "ABC\n가나다";
        System.out.println(output);

        try (FileWriter fw = new FileWriter(FILE_NAME, UTF_8);
             BufferedWriter bw =  new BufferedWriter(fw, BUFFER_SIZE)) {
            bw.write(output);
        }

        try (FileReader fr = new FileReader(FILE_NAME, UTF_8);
             BufferedReader br = new BufferedReader(fr, BUFFER_SIZE)) {
            StringBuilder input = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                input.append(line).append("\n");
            }
            System.out.println(input);
        }
    }
}
