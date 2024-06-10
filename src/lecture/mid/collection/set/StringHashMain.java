package lecture.mid.collection.set;

public class StringHashMain {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = 'B';
        System.out.println("(int) c1 = " + (int) c1);
        System.out.println("(int) c2 = " + (int) c2);

        System.out.println("hash(\"A\") = " + hash("A"));
        System.out.println("hash(\"B\") = " + hash("B"));
        System.out.println("hash(\"AB\") = " + hash("AB"));

        System.out.println("hash(hash(\"A\")) = " + hash(hash("A")));
        System.out.println("hash(hash(\"B\")) = " + hash(hash("B")));
        System.out.println("hash(hash(\"AB\")) = " + hash(hash("AB")));
    }

    static int hash(String s) {
        var charArray = s.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += c;
        }
        return sum;
    }

    private static int hash(int value) {
        return value % CAPACITY;
    }
}
