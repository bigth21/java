package lecture.advanced.thread.control.printer;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

import static lecture.advanced.util.MyLogger.log;

public class MyPrinterV4 {
    public static void main(String[] args) {
        var printer = new Printer();
        var printerThread = new Thread(printer, "printer");
        printerThread.start();

        Scanner sc = new Scanner(System.in);
        while (true) {
            log("Please enter the content to print");
            String input = sc.nextLine();
            if (input.equals("q")) {
                printerThread.interrupt();
                break;
            }
            printer.addJob(input);
        }
    }

    static class Printer implements Runnable {
        Queue<String> jobQueue = new ConcurrentLinkedQueue<>();

        @Override
        public void run() {
            while (!Thread.interrupted()) {
                if (jobQueue.isEmpty()) {
                    Thread.yield();
                    continue;
                }

                try {
                    String job = jobQueue.poll();
                    log("Start printing: " + job + ", Waiting: " + jobQueue);
                    Thread.sleep(3000);
                    log("End printing: " + job);
                } catch (InterruptedException e) {
                    log("Interrupted");
                    break;
                }
            }
            log("Terminated");
        }

        public void addJob(String job) {
            jobQueue.offer(job);
        }
    }
}
