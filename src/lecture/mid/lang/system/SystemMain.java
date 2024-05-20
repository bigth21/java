package lecture.mid.lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("now = " + currentTimeMillis);

        long nanoTime = System.nanoTime();
        System.out.println("nanoTime = " + nanoTime);

        System.out.println("System.getenv() = " + System.getenv()); // OS

        System.out.println("System.getProperties() = " + System.getProperties()); // JVM
        System.out.println("System.getProperty(\"java.version\") = " + System.getProperty("java.version"));

        char[] originalArr = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArr = new char[originalArr.length];
        System.arraycopy(originalArr, 0, copiedArr, 0, originalArr.length);
        System.out.println(copiedArr);

        System.out.println("Arrays.toString(copiedArr) = " + Arrays.toString(copiedArr));
    }
}
