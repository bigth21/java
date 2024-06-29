package algorithm.search.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsBinarySearch {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(List.of(5, 4, 8, 2, 9, 1, 3, 7, 2, 6));
        Integer target = 9;
        input.sort(Comparator.naturalOrder());

        int index = Collections.binarySearch(input, target);
        System.out.println("index = " + index);
    }
}
