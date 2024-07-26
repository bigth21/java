package lecture.intermediate.collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        BatchProcessor processor1 = new BatchProcessor(new MyArrayList<>());
        processor1.logic(100_000);

        BatchProcessor processor2 = new BatchProcessor(new MyLinkedList<>());
        processor2.logic(100_000);
    }
}
