package lecture.intermediate.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain1 {
    public static void main(String[] args) {
        Map<String, Integer> grades = new HashMap<>();
        grades.put("studentA", 90);
        grades.put("studentB", 80);
        grades.put("studentC", 80);
        grades.put("studentD", 80);
        System.out.println("grades = " + grades);

        System.out.println("grades.get(\"studentD\") = " + grades.get("studentD"));

        System.out.println("grades.keySet() = " + grades.keySet());
        System.out.println("grades.values() = " + grades.values());
        System.out.println("grades.entrySet() = " + grades.entrySet());
    }
}
