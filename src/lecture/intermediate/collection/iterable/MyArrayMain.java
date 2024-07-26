package lecture.intermediate.collection.iterable;

public class MyArrayMain {
    public static void main(String[] args) {
        var myArray = new MyArray(new int[]{1, 2, 3, 4});

        var iterator = myArray.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Integer value : myArray) {
            System.out.println(value);
        }
    }
}
