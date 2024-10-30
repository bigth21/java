package lecture.advanced1.thread.collection.java;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetMain {
    public static void main(String[] args) {
        Set<String> list = new CopyOnWriteArraySet<>();
        list.add("data1");
        list.add("data2");
        list.add("data3");
        System.out.println("list.getClass() = " + list.getClass());
        System.out.println("list = " + list);

        Set<String> list2 = new ConcurrentSkipListSet<>(Comparator.reverseOrder());
        list2.add("data2");
        list2.add("data3");
        list2.add("data1");
        System.out.println("list2.getClass() = " + list2.getClass());
        System.out.println("list2 = " + list2);
    }
}
