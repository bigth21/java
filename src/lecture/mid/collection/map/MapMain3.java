package lecture.mid.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {
    public static void main(String[] args) {
        Map<String, Integer> grades = new HashMap<>();

        grades.put("studentA", 50);
        System.out.println("grades = " + grades);

        if (!grades.containsKey("studentA")) {
            grades.put("studentA", 100);
        }
        System.out.println("grades = " + grades);

        grades.putIfAbsent("studentA", 100);
        grades.putIfAbsent("studentB", 100);
        System.out.println("grades = " + grades);
    }
}
