public class BankAccount {

    private double balance;

    /*Constructs a bank account with 0 balance*/

    public BankAccount() {
        this.balance = 0;
    }

    /*Constructs a bank account with an initial balance*/
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    /*Deposit money into the bank account*/
    public void deposit(double amount) {
        this.balance += amount;
    }

    /*Withdraw money from the bank account*/
    public void withdraw(double amount) {
        this.balance -= amount;
    }

    /*Return the balance*/
    public double getBalance() {
        return balance;
    }

    public void transfer (double amount, BankAccount other){
        withdraw(amount);
        other.deposit(amount);
    }
}
