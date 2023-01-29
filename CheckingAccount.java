
public class CheckingAccount extends Account {
    private double credit;

    public CheckingAccount() {
    }

    public CheckingAccount(double amount, double credit) {
        balance = amount;
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance + credit) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}
