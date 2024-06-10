package lecture.mid.collection.list;

public class MyListPerformanceTest {
    private static final int SIZE = 50_000;
    private static final int GET_ITER = 10_000;

    public static void main(String[] args) {
        addAtFirst(new MyArrayList<>());
        addAtMiddle(new MyArrayList<>());
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        addAtLast(arrayList);

        addAtFirst(new MyLinkedList<>());
        addAtMiddle(new MyLinkedList<>());
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        addAtLast(linkedList);

        get(arrayList, 0);
        get(arrayList, SIZE / 2);
        get(arrayList, SIZE - 1);

        get(linkedList, 0);
        get(linkedList, SIZE / 2);
        get(linkedList, SIZE - 1);

        indexOf(arrayList, 0);
        indexOf(arrayList, SIZE / 2);
        indexOf(arrayList, SIZE - 1);

        indexOf(linkedList, 0);
        indexOf(linkedList, SIZE / 2);
        indexOf(linkedList, SIZE - 1);
    }

    private static void addAtFirst(MyList<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("concrete class: %s, size: %d, time: %d ms\n", list.getClass().getSimpleName(), SIZE, endTime - startTime);
    }

    private static void addAtMiddle(MyList<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            list.add(i / 2, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("concrete class: %s, size: %d, time: %d ms\n", list.getClass().getSimpleName(), SIZE, endTime - startTime);
    }

    private static void addAtLast(MyList<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            list.add(i, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("concrete class: %s, size: %d, time: %d ms\n", list.getClass().getSimpleName(), SIZE, endTime - startTime);
    }

    private static void get(MyList<Integer> list, int index) {
        long startTime = System.currentTimeMillis();
        int value = -1;
        for (int i = 0; i < GET_ITER; i++) {
            value = list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("concrete class: %s, value: %d, size: %d, time: %d ms\n", list.getClass().getSimpleName(), value, GET_ITER, endTime - startTime);
    }

    private static void indexOf(MyList<Integer> list, int value) {
        long startTime = System.currentTimeMillis();
        int index = -1;
        for (int i = 0; i < GET_ITER; i++) {
            index = list.indexOf(value);
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("concrete class: %s, value: %d, index: %d, size: %d, time: %d ms\n", list.getClass().getSimpleName(), value, index, GET_ITER, endTime - startTime);
    }

}
