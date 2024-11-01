package lecture.advanced2.io.file.text;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

import static java.nio.charset.StandardCharsets.UTF_8;

public class ReadTextFileV2 {
    private static final String PATH = "temp/hello2.txt";

    public static void main(String[] args) throws IOException {
        String output = "ABC\n가나다";
        System.out.println(output);

        Path path = Path.of(PATH);

        Files.writeString(path, output, UTF_8);

        // There is a possibility of insufficient memory.
//        List<String> input = Files.readAllLines(path, UTF_8);
//        for (String s : input) {
//            System.out.println(s);
//        }
        // Use this instead of preceding example to read file.
        try (Stream<String> lines = Files.lines(path, UTF_8)) {
            lines.forEach(System.out::println);
        }
    }
}
