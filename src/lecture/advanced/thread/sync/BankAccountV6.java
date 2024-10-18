package lecture.advanced.thread.sync;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static lecture.advanced.util.MyLogger.log;
import static lecture.advanced.util.ThreadUtils.sleep;

public class BankAccountV6 implements BankAccount {
    private int balance;

    private final Lock lock = new ReentrantLock(true);

    public BankAccountV6(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean withdraw(int amount) {
        log("Start withdrawal");

        try {
            if (!lock.tryLock(500, TimeUnit.MILLISECONDS)) {
                log("Failed to lock");
                return false;
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

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
