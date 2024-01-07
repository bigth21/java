package stream;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class IntermediateOperations {

    public static class Distinct {
        public static void main(String[] args) {
            List<Integer> nums = List.of(1, 1, 2, 3, 4, 4);
            nums.stream()
                    .distinct()
                    .forEach(v -> System.out.println("v = " + v));
        }
    }

    public static class Filter {
        public static void main(String[] args) {
            List<Integer> nums = List.of(1, 1, 2, 3, 4, 4);
            nums.stream()
                    .filter(n -> n != 1)
                    .forEach(n -> System.out.println("n = " + n));
        }
    }

    public static class Limit {
        public static void main(String[] args) {
            List<Integer> nums = List.of(1, 1, 2, 3, 4, 4);
            nums.stream()
                    .limit(3)
                    .forEach(n -> System.out.println("n = " + n));
        }
    }

    public static class Skip {
        public static void main(String[] args) {
            List<Integer> nums = List.of(1, 1, 2, 3, 4, 4);
            nums.stream()
                    .skip(3)
                    .forEach(n -> System.out.println("n = " + n));
        }
    }

    public static class Peek {
        public static void main(String[] args) {
            List<Integer> nums = List.of(1, 1, 2, 3, 4, 4);
            List<Integer> multiplesOf2 = nums.stream()
                    .filter(n -> n % 2 == 0)
                    .peek(n -> System.out.println("n = " + n))
                    .toList();
        }
    }

    public static class Sort {
        public static void main(String[] args) {
            List<Integer> nums = List.of(1, 1, 2, 3, 4, 4);
            nums.stream()
                    .sorted(Comparator.reverseOrder())
                    .forEach(n -> System.out.println("n = " + n));
        }
    }

    public static class Map {
        public static void main(String[] args) {
            List<Integer> nums = List.of(1, 1, 2, 3, 4, 4);
            nums.stream()
                    .map(n -> n * 3)
                    .forEach(n -> System.out.println("n = " + n));
        }
    }

    public static class MapToDouble {
        public static void main(String[] args) {
            List<Integer> nums = List.of(1, 1, 2, 3, 4, 4);
            nums.stream()
                    .mapToDouble(n -> n)
                    .forEach(d -> System.out.println("d = " + d));
        }
    }

    public static class MapToInt {
        public static void main(String[] args) {
            List<Integer> nums = List.of(1, 1, 2, 3, 4, 4);
            nums.stream()
                    .mapToInt(n -> n)
                    .forEach(i -> System.out.println("i = " + i));
        }
    }

    public static class MapToLong {
        public static void main(String[] args) {
            List<Integer> nums = List.of(1, 1, 2, 3, 4, 4);
            nums.stream()
                    .mapToLong(n -> n)
                    .forEach(l -> System.out.println("l = " + l));
        }
    }

    public static class FlatMap {
        public static void main(String[] args) {
            List<List<Integer>> nums = List.of(List.of(1, 1, 2), List.of(3, 4, 4));
            nums.stream()
                    .flatMap(Collection::stream)
                    .forEach(n -> System.out.println("n = " + n));
        }
    }

    public static class FlatMapToDouble {
        public static void main(String[] args) {
            List<List<Integer>> nums = List.of(List.of(1, 1, 2), List.of(3, 4, 4));
            nums.stream()
                    .flatMapToDouble(l -> l.stream().mapToDouble(Double::valueOf))
                    .forEach(d -> System.out.println("d = " + d));
        }
    }

    public static class FlatMapToInt {
        public static void main(String[] args) {
            List<List<Integer>> nums = List.of(List.of(1, 1, 2), List.of(3, 4, 4));
            nums.stream()
                    .flatMapToInt(l -> l.stream().mapToInt(n -> n))
                    .forEach(n -> System.out.println("n = " + n));
        }
    }

    public static class FlatMapToLong {
        public static void main(String[] args) {
            List<List<Integer>> nums = List.of(List.of(1, 1, 2), List.of(3, 4, 4));
            nums.stream()
                    .flatMapToLong(l -> l.stream().mapToLong(n -> n))
                    .forEach(n -> System.out.println("n = " + n));
        }
    }
}
