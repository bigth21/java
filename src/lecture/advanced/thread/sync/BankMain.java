package lecture.advanced.thread.sync;

import static lecture.advanced.util.MyLogger.log;
import static lecture.advanced.util.ThreadUtils.sleep;

public class BankMain {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccountV1(1_000);

        Thread thread1 = new Thread(new WithdrawalTask(account, 800));
        Thread thread2 = new Thread(new WithdrawalTask(account, 800));

        thread1.start();
        thread2.start();

        sleep(500);
        log("Thread1 state = " + thread1.getState());
        log("Thread2 state = " + thread2.getState());

        thread1.join();
        thread2.join();

        log("Final balance = " + account.getBalance());
    }
}
