package lecture.advanced.thread.collection;

public class SyncProxyList implements SimpleList {
    private SimpleList list;

    public SyncProxyList(SimpleList list) {
        this.list = list;
    }

    @Override
    public synchronized int size() {
        return list.size();
    }

    @Override
    public synchronized void add(Object e) {
        list.add(e);
    }

    @Override
    public synchronized Object get(int index) {
        return list.get(index);
    }

    @Override
    public synchronized String toString() {
        return list.toString();
    }
}
