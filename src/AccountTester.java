public class AccountTester {

    /**
     * Test class to test out the CheckingAccount class
     */

    public static void main(String[] args) {

        SavingsAccount ellensSavings = new SavingsAccount(0.5);

        CheckingAccount craigsChecking = new CheckingAccount(100);

        ellensSavings.deposit(10000);

        ellensSavings.transfer(2000, craigsChecking);
        craigsChecking.withdraw(1500);
        craigsChecking.withdraw(80);

        ellensSavings.transfer(1000, craigsChecking);
        craigsChecking.withdraw(400);

        //Simulate end of month
        ellensSavings.addInterest();
        craigsChecking.deductFees();

        System.out.println("Ellen's savings balance: " + ellensSavings.getBalance());
        System.out.println("Expected: 7035");

        System.out.println("Craig's checking balance: " + craigsChecking.getBalance());
        System.out.println("Expected: 1116");




    }

}
