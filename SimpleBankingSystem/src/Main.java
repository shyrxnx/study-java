public class Main {
    public static void main(String[] args) {

        // Create Savings Account
        SavingsAccount savingsAccount = new SavingsAccount("SA001", 1500, 0.10);
        savingsAccount.displayAccountDetails();

        // Create Checking Account
        CheckingAccount checkingAccount = new CheckingAccount("CA001", 1000);
        checkingAccount.displayAccountDetails();

        // Deposit and Withdraw from Savings Account
        savingsAccount.deposit(200.0);
        savingsAccount.withdraw(150.0);
        savingsAccount.displayAccountDetails();

        // Deposit and Withdraw from Checking Account
        checkingAccount.deposit(50.0);
        checkingAccount.withdraw(100.0);
        checkingAccount.displayAccountDetails();

    }
}