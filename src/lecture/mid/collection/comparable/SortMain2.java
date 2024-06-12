package lecture.mid.collection.comparable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortMain2 {
    public static void main(String[] args) {
        int[] a = {3, 2, 1};
        Integer[] arr = Arrays.stream(a)
                .boxed()
//                .toArray(n -> new Integer[n]);
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, new AscComparator());
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, new AscComparator().reversed());
        System.out.println(Arrays.toString(arr));

        a = Arrays.stream(arr)
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(Arrays.toString(a));
    }

    private static class AscComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 < o2 ? -1 : (o1 == o2 ? 0 : 1);
        }
    }

    private static class DescComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 < o2 ? 1 : (o1 == o2 ? 0 : -1);
        }
    }
}
