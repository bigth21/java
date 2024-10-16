package lecture.advanced.thread.sync;

import static lecture.advanced.util.MyLogger.log;
import static lecture.advanced.util.ThreadUtils.sleep;

public class BankAccountV3 implements BankAccount {
    private int balance;

    public BankAccountV3(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean withdraw(int amount) {
        log("Start withdrawal");

        synchronized (this) {
            log("Amount = " + amount + ", balance: " + balance);
            if (balance < amount) {
                log("Insufficient balance. amount = " + amount + ", balance: " + balance);
                return false;
            }
            sleep(1_000);
            balance -= amount;
            log("Withdrawal complete. Amount = " + amount + ", balance: " + balance);
        }

        log("End withdrawal");
        return true;
    }

    @Override
    public int getBalance() {
        return balance;
    }
}
