package lecture.advanced.thread.collection.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListMain {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("data1");
        list.add("data2");
        list.add("data3");
        System.out.println("list.getClass() = " + list.getClass());
        System.out.println("list = " + list);
    }
}