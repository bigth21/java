package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class TerminalOperations {

    public static class ForEach {
        public static void main(String[] args) {
            List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);
            nums.forEach(n -> System.out.println("n = " + n));
        }
    }

    public static class ForEachOrdered {
        public static void main(String[] args) {
            List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);
            nums.stream()
                    .forEachOrdered(n -> System.out.println("n = " + n));
        }
    }

    public static class Count {
        public static void main(String[] args) {
            List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);
            long count = nums.stream()
                    .count();
            System.out.println("count = " + count);
        }
    }

    private static class Max {
        public static void main(String[] args) {
            List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);
            Integer max = nums.stream()
                    .max(Comparator.naturalOrder())
                    .get();
            System.out.println("max = " + max);
        }
    }

    private static class Min {
        public static void main(String[] args) {
            List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);
            Integer min = nums.stream()
                    .min(Comparator.naturalOrder())
                    .get();
            System.out.println("min = " + min);
        }
    }

    private static class FindAny {
        public static void main(String[] args) {
            List<Integer> nums = List.of(1, 2, 3, 2, 5, 2);
            Integer any = nums.stream()
                    .filter(n -> n == 2)
                    .findAny()
                    .orElseThrow();
            System.out.println("any = " + any);
        }
    }

    private static class FindFirst {
        public static void main(String[] args) {
            List<Integer> nums = List.of(1, 2, 3, 2, 5, 2);
            Integer any = nums.stream()
                    .filter(n -> n == 2)
                    .findFirst()
                    .orElseThrow();
            System.out.println("any = " + any);
        }
    }

    private static class AllMatch {
        public static void main(String[] args) {
            List<Integer> nums = List.of(1, 2, 3, 2, 5, 2);
            boolean allMatch = nums.stream()
                    .allMatch(n -> n == 2);
            System.out.println("allMatch = " + allMatch);
        }
    }

    private static class AnyMatch {
        public static void main(String[] args) {
            List<Integer> nums = List.of(1, 2, 3, 2, 5, 2);
            boolean anyMatch = nums.stream()
                    .anyMatch(n -> n == 2);
            System.out.println("anyMatch = " + anyMatch);
        }
    }

    private static class NonMatch {
        public static void main(String[] args) {
            List<Integer> nums = List.of(1, 2, 3, 2, 5, 2);
            boolean noneMatch = nums.stream()
                    .noneMatch(n -> n == 6);
            System.out.println("noneMatch = " + noneMatch);
        }
    }

    private static class ToArray {
        public static void main(String[] args) {
            List<Integer> nums = List.of(1, 2, 3, 2, 5, 2);
            Integer[] array1 = nums.toArray(Integer[]::new);
            int[] array2 = nums.stream()
                    .mapToInt(n -> n)
                    .toArray();
        }
    }

    private static class Reduce {
        public static void main(String[] args) {
            List<Integer> nums = List.of(1, 2, 3, 2, 5, 2);

            Integer reduce = nums.stream()
                    .reduce(BinaryOperator.maxBy(Comparator.naturalOrder()))
                    .orElseThrow();
            System.out.println("reduce = " + reduce);

            // With identity value
            Integer product = nums.stream()
                    .reduce(1, (a, b) -> a * b);
            System.out.println("product = " + product);

            // Without identity value
            product = nums.stream()
                    .reduce((a, b) -> a * b)
                    .orElseThrow();
            System.out.println("product = " + product);

        }
    }

    private static class Collect {
        public static void main(String[] args) {
            int[] array = new int[]{1, 2, 3, 2, 5, 2};
            List<Integer> collect = Arrays.stream(array)
                    .boxed()
                    .toList();
        }
    }
}
