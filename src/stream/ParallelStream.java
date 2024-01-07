package stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<String> strs = List.of("ab", "abc", "bbbc", "a", "ab", "abc", "bbbc", "a", "ab", "abc", "bbbc", "a");
        int sum = strs.stream()
                .parallel()
                .mapToInt(String::length)
                .sum();
        System.out.println("sum = " + sum);
    }
}
