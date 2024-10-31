package lecture.advanced2.io.buffered;

import java.io.FileOutputStream;
import java.io.IOException;

import static lecture.advanced2.io.buffered.BufferedConst.FILE_NAME;
import static lecture.advanced2.io.buffered.BufferedConst.FILE_SIZE;


public class CreateFileV1 {
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();

        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        for (int i = 0; i < FILE_SIZE; i++) {
            fos.write(1);
        }
        fos.close();

        long endTime = System.currentTimeMillis();

        System.out.println("File created: " + FILE_NAME);
        System.out.println("File size: " + FILE_SIZE / 1024 / 1024 + "MB");
        System.out.println("Time taken: " + (endTime - startTime) + "ms");
    }
}
