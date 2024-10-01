package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>() {{
            put("a", 1);
            put("b", 2);
            put("c", 3);
        }};
        System.out.println("map = " + map);

        map.compute("a", (k, v) -> {
            if (v == null) {
                return -1;
            } else {
                return v + 1;
            }

        });
        System.out.println("map = " + map);

        map.computeIfPresent("a", (k, v) -> v + 1);
        System.out.println("map = " + map);

        map.computeIfAbsent("d", k -> -1);
        System.out.println("map = " + map);

        map.putIfAbsent("e", -1);
        System.out.println("map = " + map);

        System.out.println("map.containsKey(\"a\") = " + map.containsKey("a"));
        System.out.println("map.containsKey(\"f\") = " + map.containsKey("f"));

        System.out.println("map.entrySet() = " + map.entrySet());

        System.out.println("map.keySet() = " + map.keySet());

        System.out.println("map.values() = " + map.values());

        System.out.println("map.isEmpty() = " + map.isEmpty());

        map.remove("a");
        System.out.println("map = " + map);

        System.out.println("map.size() = " + map.size());

        map.merge("b", 2, (v1, v2) -> v1 + v2);
        System.out.println("map = " + map);

        map.clear();
        System.out.println("map = " + map);
    }
}
