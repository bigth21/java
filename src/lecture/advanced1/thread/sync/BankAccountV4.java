package lecture.advanced1.thread.sync;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static lecture.advanced1.util.MyLogger.log;
import static lecture.advanced1.util.ThreadUtils.sleep;

public class BankAccountV4 implements BankAccount {
    private int balance;

    private final Lock lock = new ReentrantLock(true);

    public BankAccountV4(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean withdraw(int amount) {
        log("Start withdrawal");

        lock.lock();
        try {
            log("Amount = " + amount + ", balance: " + balance);
            if (balance < amount) {
                log("Insufficient balance. amount = " + amount + ", balance: " + balance);
                return false;
            }
            sleep(1_000);
            balance -= amount;
            log("Withdrawal complete. Amount = " + amount + ", balance: " + balance);
        } finally {
            lock.unlock();
        }

        log("End withdrawal");
        return true;
    }

    @Override
    public int getBalance() {
        return balance;
    }
}
