package lecture.mid.collection.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3);
        Set<Integer> set = Set.of(1, 2, 3);
        Map<String, Integer> map = Map.of("one", 1, "two", 2, "three", 3);

        System.out.println("list = " + list);
        System.out.println("set = " + set);
        System.out.println("map = " + map);

        System.out.println("list.getClass() = " + list.getClass());
    }
}
