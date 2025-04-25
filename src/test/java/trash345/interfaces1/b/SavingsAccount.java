package trash345.interfaces1.b;

public class SavingsAccount implements Account {

    private double balance;
    private double interestRate;


    public SavingsAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public void applyInterest() {
        balance += balance * interestRate / 100;
    }
}
