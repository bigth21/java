package lecture.mid.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {
    public static void main(String[] args) {
        Map<String, Integer> grades = new HashMap<>();

        grades.put("studentA", 90);
        System.out.println("grades = " + grades);

        grades.put("studentA", 100);
        System.out.println("grades = " + grades);

        System.out.println("grades.containsKey(\"studentA\") = " + grades.containsKey("studentA"));

        grades.remove("studentA");
        System.out.println("grades = " + grades);

    }
}
