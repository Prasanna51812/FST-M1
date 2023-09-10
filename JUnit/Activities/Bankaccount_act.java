package examples;

public class Bankaccount_act {
    private Integer balance;
    public Bankaccount_act(Integer initialBalance) {
        balance = initialBalance;
    }

    public Integer withdraw(Integer amount) {
        if (balance < amount) {
            throw new NotEnoughFundsException(amount, balance);
        }
        balance -= amount;
        return balance;
    }


    public static class NotEnoughFundsException extends RuntimeException {

        public NotEnoughFundsException(Integer amount, Integer balance) {
            super("Attempted to withdraw " + amount + " with a balance of " + balance);
        }

    }
}
