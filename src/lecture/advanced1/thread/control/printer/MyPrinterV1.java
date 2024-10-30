package lecture.advanced1.thread.control.printer;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

import static lecture.advanced1.util.MyLogger.log;
import static lecture.advanced1.util.ThreadUtils.sleep;

public class MyPrinterV1 {
    public static void main(String[] args) {
        var printer = new Printer();
        var printerThread = new Thread(printer, "printer");
        printerThread.start();

        Scanner sc = new Scanner(System.in);
        while (true) {
            log("Please enter the content to print");
            String input = sc.nextLine();
            if (input.equals("q")) {
                printer.working = false;
                break;
            }
            printer.addJob(input);
        }
    }

    static class Printer implements Runnable {
        volatile boolean working = true;
        Queue<String> jobQueue = new ConcurrentLinkedQueue<>();

        @Override
        public void run() {
            while (working) {
                if (jobQueue.isEmpty()) {
                    continue;
                }

                String job = jobQueue.poll();
                log("Start printing: " + job + ", Waiting: " + jobQueue);
                sleep(3000);
                log("End printing: " + job);
            }
            log("Terminated");
        }

        public void addJob(String job) {
            jobQueue.offer(job);
        }
    }
}
