package stream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreation {

    public static void main(String[] args) {
        // Collections
        List<Integer> collections = List.of(1, 2, 3, 4, 5);
        Stream<Integer> stream = collections.stream();

        // Arrays
        Stream<String> strStream1 = Stream.of("a", "b", "c");
        Stream<String> strStream2 = Stream.of(new String[]{"a", "b", "c"});
        Stream<String> strStream3 = Arrays.stream(new String[]{"a", "b", "c"});
        IntStream intStream1 = IntStream.of(1, 2, 3);
        IntStream intStream2 = IntStream.of(new int[]{1, 2, 3});
        IntStream intStream3 = Arrays.stream(new int[]{1, 2, 3});
        IntStream intStream4 = Arrays.stream(new int[]{1, 2, 3}, 0, 2);

        // Integers in specific range
        IntStream intStream5 = IntStream.range(0, 10);
        IntStream intStream6 = IntStream.rangeClosed(0, 10);

        // Random number
        new Random().ints()
                .limit(5);
        new Random().ints(5); // Integer.MIN_VALUE <= i <= Integer.MAX_VALUE
        new Random().ints(5, -5, 5);

        new Random().longs()
                .limit(5);
        new Random().longs(5); // Long.MIN_VALUE <= l <= Long.MAX_VALUE
        new Random().longs(5, -5, 5);

        new Random().doubles()
                .limit(5);
        new Random().doubles(5); // 0 <= d < 1
        new Random().doubles(5, 5, 7);

        // Lambda expression
        Stream.iterate(0, n -> n + 2)
                .limit(10);

        Stream.generate(Math::random) // Do not use preceding result
                .limit(10);

        // Files
//        Files.list(Path.of("path"));
//        Files.lines(Path.of("path"));

        // Empty stream
        Stream.empty();

        // Concatenation of two streams
        Stream<String> str1 = Stream.of("123", "456", "789");
        Stream<String> str2 = Stream.of("ABC", "abc", "DEF");
        Stream.concat(str1, str2)
                .forEach(s -> System.out.println("s = " + s));
    }
}
