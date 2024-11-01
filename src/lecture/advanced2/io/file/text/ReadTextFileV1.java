package lecture.advanced2.io.file.text;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.charset.StandardCharsets.UTF_8;
import static lecture.advanced2.io.text.TextConst.FILE_NAME;

public class ReadTextFileV1 {
    private static final String PATH = "temp/hello2.txt";

    public static void main(String[] args) throws IOException {
        String output = "ABC\n가나다";
        System.out.println(output);

        Path path = Path.of(PATH);

        Files.writeString(path, output, UTF_8);

        String input = Files.readString(path, UTF_8);
        System.out.println(input);
    }
}
