package lecture.advanced2.io.buffered;

import java.io.FileOutputStream;
import java.io.IOException;

import static lecture.advanced2.io.buffered.BufferedConst.*;


public class CreateFileV2 {
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();

        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        byte[] buffer = new byte[BUFFER_SIZE];
        int bufferIndex = 0;
        for (int i = 0; i < FILE_SIZE; i++) {
            buffer[bufferIndex++] = 1;
            if (bufferIndex == BUFFER_SIZE) {
                fos.write(buffer);
                bufferIndex = 0;
            }
        }
        if (bufferIndex > 0) {
            fos.write(buffer, 0, bufferIndex);
        }
        fos.close();

        long endTime = System.currentTimeMillis();

        System.out.println("File created: " + FILE_NAME);
        System.out.println("File size: " + FILE_SIZE / 1024 / 1024 + "MB");
        System.out.println("Time taken: " + (endTime - startTime) + "ms");
    }
}