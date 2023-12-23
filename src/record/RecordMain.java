package record;

public class RecordMain {

    public static void main(String[] args) {
        var data1 = new Data("name", "somewhere");
        var data2 = new Data("name", "somewhere");

        System.out.println("data1 = " + data1);
        System.out.println("data2 = " + data2);
        System.out.println("data1 == data2: " + (data1 == data2));
        System.out.println("data1.equals(data2): " + data1.equals(data2));

        // Throw NullPointerException
        var somewhere = new Data(null, "somewhere");
    }
}
