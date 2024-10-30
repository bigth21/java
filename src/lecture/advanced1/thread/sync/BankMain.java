package lecture.advanced1.thread.sync;

import static lecture.advanced1.util.MyLogger.log;
import static lecture.advanced1.util.ThreadUtils.sleep;

public class BankMain {
    public static void main(String[] args) throws InterruptedException {
//        BankAccount account = new BankAccountV1(1_000);
//        BankAccount account = new BankAccountV2(1_000);
//        BankAccount account = new BankAccountV3(1_000);
//        BankAccount account = new BankAccountV4(1_000);
//        BankAccount account = new BankAccountV5(1_000);
        BankAccount account = new BankAccountV6(1_000);

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
