package lecture.advanced2.io.buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import static lecture.advanced2.io.buffered.BufferedConst.BUFFER_SIZE;
import static lecture.advanced2.io.buffered.BufferedConst.FILE_NAME;

public class ReadFileV4 {
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();

        int fileSize = 0;
        try (FileInputStream fis = new FileInputStream(FILE_NAME);
             BufferedInputStream bis = new BufferedInputStream(fis, BUFFER_SIZE)) {

            int data;
            while ((data = bis.read()) != -1) {
                fileSize += 1;
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println("File created: " + FILE_NAME);
        System.out.println("File size: " + fileSize / 1024 / 1024 + "MB");
        System.out.println("Time taken: " + (endTime - startTime) + "ms");
    }
}
