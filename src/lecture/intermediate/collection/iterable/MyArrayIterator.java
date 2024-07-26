package lecture.intermediate.collection.iterable;

import java.util.Iterator;

public class MyArrayIterator implements Iterator<Integer> {
    private int currentIdx = 0;
    private int[] targetArr;

    public MyArrayIterator(int[] targetArr) {
        this.targetArr = targetArr;
    }

    @Override
    public boolean hasNext() {
        return currentIdx < targetArr.length;
    }

    @Override
    public Integer next() {
        return targetArr[currentIdx++];
    }
}
