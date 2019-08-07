import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();



        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
//        BankAccount account3 = new BankAccount();

        accounts.add(account1);
        accounts.add(account2);
        BankAccount account3;
        accounts.add(account3 = new BankAccount());


        account1.deposit(10.00);
        account1.withdraw(5.00);
        System.out.println("Balance: " + account1.getBalance());

        account2.deposit(30.00);
        System.out.println("Balance: " + account2.getBalance());

        account3.deposit(100.00);
        System.out.println("Balance: " + account3.getBalance());


        System.out.println("Size: " + accounts.size());

        BankAccount first = accounts.get(0);
        System.out.println("First account: " + first.getBalance());
    }
}
