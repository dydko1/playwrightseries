package trash345.constructor;

public class Account {

    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {

        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("Invalid account number");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Invalid balance");
        }

        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}
