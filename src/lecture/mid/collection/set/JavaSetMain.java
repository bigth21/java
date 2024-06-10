package lecture.mid.collection.set;

import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {
        run(new HashSet<>());
        run(new LinkedHashSet<>());
        run(new TreeSet<>());

    }

    private static void run(Set<String> hashSet) {
        System.out.println("hashSet.getClass() = " + hashSet.getClass());

        hashSet.add("C");
        hashSet.add("B");
        hashSet.add("A");
        hashSet.add("1");
        hashSet.add("2");

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
        System.out.println();
    }
}
