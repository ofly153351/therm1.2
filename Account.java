
public class Account {
    protected double balance;

    public Account() {
    }

    public Account(double amount) {
        balance = amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public void showBalance() {
        System.out.println(getBalance());
    }

    public double getBalance() {
        return balance;
    }
}
