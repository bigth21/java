package algorithm.map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapMain {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>(); // Sorted according to the natural ordering of its keys
        map.put(1, "First");
        map.put(2, "Second");
        map.put(3, "Third");
        System.out.println("map = " + map);

        System.out.println("map.firstEntry() = " + map.firstEntry());
        System.out.println("map.lastEntry() = " + map.lastEntry());
    }
}
