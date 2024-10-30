package lecture.advanced1.thread.sync;

public class WithdrawalTask implements Runnable {
    private final BankAccount account;
    private final int amount;

    public WithdrawalTask(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}
