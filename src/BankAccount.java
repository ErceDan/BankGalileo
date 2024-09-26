public class BankAccount {
    private double balance = 0.0;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(amount){
        balance += amount:
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount [balance=" + balance + ", toString()=" + super.toString() + "]";
    }



}
